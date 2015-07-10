(defproject clojurewerkz/vat "1.0.0-beta2"
  :description "A tiny Clojure library that makes VAT calculation easier"
  :license { :name "Eclipse Public License" }
  :min-lein-version "2.5.1"  
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :jar-exclusions [#"\.cljx|\.swp|\.swo|\.DS_Store"]  
  :profiles {:1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :master {:dependencies [[org.clojure/clojure "1.7.0-master-SNAPSHOT"]]}
             :dev {:dependencies [[org.clojure/clojurescript "0.0-2138"]]
                   :plugins [[codox "0.8.10"]
                             [com.keminglabs/cljx "0.5.0" :exclusions [org.clojure/clojure]]
                             [lein-cljsbuild "1.0.2"]
                             [com.cemerick/clojurescript.test "0.2.1"]]
                   :cljx {:builds [{:source-paths ["src/cljx"]
                                    :output-path "target/classes"
                                    :rules :clj}
                                   {:source-paths ["src/cljx"]
                                    :output-path "target/classes"
                                    :rules :cljs}
                                   {:source-paths ["test"]
                                    :output-path "target/test-classes"
                                    :rules :clj}
                                   {:source-paths ["test"]
                                    :output-path "target/test-classes"
                                    :rules :cljs}]}
                   :cljsbuild {:test-commands {"phantom" ["phantomjs" :runner "target/testable.js"]}
                               :builds [{:source-paths ["target/classes" "target/test-classes"]
                                         :compiler {:output-to "target/testable.js"
                                                    :libs [""]
                                                    :source-map "target/testable.js.map"
                                                    :optimizations :advanced}}]}
                   :codox {:sources ["src/cljx" "target/classes"]
                           :output-dir "doc/api"}}}
  :aliases {"all" ["with-profile" "dev:dev,1.6:dev,master"]}
  :repositories {"sonatype" {:url "http://oss.sonatype.org/content/repositories/releases"
                             :snapshots false
                             :releases {:checksum :fail}}
                 "sonatype-snapshots" {:url "http://oss.sonatype.org/content/repositories/snapshots"
                                       :snapshots true
                                       :releases {:checksum :fail :update :always}}}
  :javac-options ["-target" "1.6" "-source" "1.6"]
  :jvm-opts      ["-Dfile.encoding=utf-8"]
  :source-paths  ["src/cljx" "target/classes"]
  :test-paths    ["target/test-classes"]
  :auto-clean false)

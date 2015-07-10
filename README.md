# Clojure VAT Library

VAT is a tiny Clojure library that aims to make VAT calculation easier.


## Project Goals

 * Make VAT calculation less of a pain in the neck
 * Be well-tested
 

## Project Maturity

VAT is *very* young and incomplete.


## Artifacts

VAT artifacts are [released to Clojars](https://clojars.org/clojurewerkz/vat). If you are using Maven, add the following repository
definition to your `pom.xml`:

``` xml
<repository>
  <id>clojars.org</id>
  <url>http://clojars.org/repo</url>
</repository>
```

### The Most Recent Release

With Leiningen:

    [clojurewerkz/vat "1.0.0-beta2"]


With Maven:

    <dependency>
      <groupId>clojurewerkz</groupId>
      <artifactId>vat</artifactId>
      <version>1.0.0-beta2</version>
    </dependency>


## Documentation & Examples

Our documentation site is not yet live, sorry.


## Supported Clojure versions

VAT is built from the ground up for Clojure 1.6.0 and later.


## Continuous Integration Status

[![Continuous Integration status](https://secure.travis-ci.org/clojurewerkz/vat.png)](http://travis-ci.org/clojurewerkz/vat)


## vat Is a ClojureWerkz Project

vat is part of the [group of Clojure libraries known as ClojureWerkz](http://clojurewerkz.org), together with


 * [Langohr](http://clojurerabbitmq.info)
 * [Elastisch](http://clojureelasticsearch.info)
 * [Cassaforte](http://clojurecassandra.info)
 * [Monger](http://clojuremongodb.info)
 * [Neocons](http://clojureneo4j.info)
 * [Meltdown](https://github.com/clojurewerkz/meltdown)  

and several others.


## Development

vat uses [Leiningen
2](https://github.com/technomancy/leiningen/blob/master/doc/TUTORIAL.md). Make
sure you have it installed and then run tests against supported
Clojure versions using

    lein2 all test

Then create a branch and make your changes on it. Once you are done
with your changes and all tests pass, submit a pull request on GitHub.



## License

Copyright (C) 2015 Andrey Barkanov, Michael S. Klishin, and The ClojureWerkz Team.

Double licensed under the [Eclipse Public License](http://www.eclipse.org/legal/epl-v10.html) (the same as Clojure) or
the [Apache Public License 2.0](http://www.apache.org/licenses/LICENSE-2.0.html).

(defproject ecstatic-play "1.0.0-SNAPSHOT"
  :description "the personal website of spy, artist, lover... Jesse Diaz"
  :url "http://ecstatic-play.herokuapp.com"
  :license {:name "to kill"
            :url "https://fierce-island-4087.herokuapp.com/"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.1"]
                 [ring/ring-jetty-adapter "1.1.0"]
                 [ring/ring-devel "1.1.0"]
                 [ring-basic-authentication "1.0.1"]
                 [environ "0.2.1"]
                 [com.cemerick/drawbridge "0.0.6"]]
  :uberjar-name "ecstatic-play-standalone.jar"
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.2.1"]]
  :hooks [environ.leiningen.hooks]
  :profiles {:production {:env {:production true}}})

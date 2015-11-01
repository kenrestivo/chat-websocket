(defproject org.httpkit/chat-websocket "1.1"
  :description "Realtime chat by utilizing http-kit's websocket support"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [ring/ring-core "1.4.0"]
                 [javax.servlet/servlet-api "2.5"]
                 [compojure "1.4.0"]
                 [org.clojure/data.json "0.2.6"]
                 [org.clojure/tools.logging "0.3.1"]
                 [ch.qos.logback/logback-classic "1.1.3"]
                 [http-kit "2.1.19"]]
  :warn-on-reflection true
  :min-lein-version "2.0.0"
  :main main
  :test-paths ["test"]
  :plugins [[lein-swank "1.4.4"]
            [lein-cljsbuild "0.3.0"]]
  :cljsbuild {
              :builds [{:source-paths ["src-cljs"]
                        :compiler {:output-to "static/main.js"
                                   :optimizations :whitespace
                                   :pretty-print true}}]}
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"})

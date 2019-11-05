(defproject classic-algorithms "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot classic-algorithms.core
  :target-path "target/%s"
  :repl-options {:port 8081}
  :profiles {:uberjar {:aot :all}})

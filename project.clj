(defproject net.eraserhead/clara-eql "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [clyfe/clara-eav "0.1.6"]
                 [com.cerner/clara-rules "0.19.0"]]
  :profiles {:dev {:dependencies [[midje "1.9.6"]]
                   :plugins [[lein-midje "3.2.1"]]}}
  :repl-options {:init-ns dev})

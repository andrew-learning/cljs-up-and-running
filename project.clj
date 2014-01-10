(defproject cljs-up-and-running "0.1.0-SNAPSHOT"
  :description "Examples from the O'Reilly book: ClojureScript Up and Running"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2138"]]
  :plugins [[lein-cljsbuild "1.0.1"]]
  :cljsbuild
  {:builds
    [{:source-paths ["src/cljs"],
         :compiler
         {:pretty-print true,
              :output-to "resources/public/generated/cljs_up_and_running.js",
              :optimizations :whitespace}}]} )

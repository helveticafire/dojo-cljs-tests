(set-env!
 :source-paths #{"src"}
 :repositories [["clojars"       "http://clojars.org/repo/"]
                ["maven-central" "http://repo1.maven.org/maven2/"]]
 :dependencies '[[adzerk/boot-cljs "0.0-3308-0"]
                 [jeluard/boot-notify "0.2.0" :scope "test"]
                 [org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "0.0-3308"]
                 [adzerk/boot-cljs-repl "0.1.9" :scope "test"]
                 [adzerk/boot-test "1.0.4" :scope "test"]])

(require '[adzerk.boot-cljs :refer :all]
          '[adzerk.boot-cljs-repl :refer [cljs-repl start-repl]]
          '[adzerk.boot-test :refer :all])

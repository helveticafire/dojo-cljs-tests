(set-env!
 :source-paths #{"src"}
 :repositories [["clojars"       "http://clojars.org/repo/"]
                ["maven-central" "http://repo1.maven.org/maven2/"]]
 :dependencies '[[adzerk/boot-cljs "0.0-3308-0"]
                 [jeluard/boot-notify "0.2.0" :scope "test"]])

(defproject viebel/ring-graphql-playground "0.1.1"
  :description "Graphql playground for Ring apps"
  :url "https://github.com/viebel/ring-graphql-playground"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :resource {:resource-paths ["ext/graphql-playground/packages/graphql-playground-react/build" "resources/graphql-playground"]
             :target-path "target/resources/graphql-playground"
             :skip-stencil [ #".*" ]
             :includes [#".*/build/static/css/index\.css"
                        #".*/build/static/js/middleware\.js"
                        #".*/build/logo\.png"
                        #".*/build/favicon\.png"
                        #"resources/graphql-playground/index\.html"]}
  :deploy-repositories [["releases"  {:sign-releases false :url "https://clojars.org/repo"}]
                        ["snapshots" {:sign-releases false :url "https://clojars.org/repo"}]]
  :resource-paths ["target/resources"]
  :hooks [leiningen.resource]
  :profiles {:dev {:plugins [[lein-resource "16.9.1"]]}})

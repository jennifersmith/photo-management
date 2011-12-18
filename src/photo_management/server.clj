(ns photo-management.server
  (:require [noir.server :as server]))

(server/load-views "src/photo_management/views/")

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8080"))]
    (server/start port {:mode mode
                        :ns 'photo-management})))


(def repl-server (atom nil))
(defn repl-start []
  (future
    (reset! repl-server
           (server/start 8080 {:mode :dev :ns 'photo-management}))
    ))

(defn repl-stop []
  (server/stop @repl-server)
  )
(ns photo-management.models.album
  (:use fs.core)
  )

(defn get-albums [path]
  (list-dir path))
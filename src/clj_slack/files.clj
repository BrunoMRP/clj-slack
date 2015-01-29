(ns clj-slack.files
  (:use [clj-slack.core :only [slack-request]])
  (:refer-clojure :exclude [list]))

(defn info
  "Gets information about a team file."
  [connection file-id]
  (slack-request connection "files.info" {"file" file-id}))

(defn list
  "Lists & filters team files."
  [connection]
  (slack-request connection "files.list"))

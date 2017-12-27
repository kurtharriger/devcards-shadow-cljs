(ns devcards-demo.core
  (:require
   [sablono.core :as sab :include-macros true]
   [devcards.core :as dc :include-macros true]))

(enable-console-print!)

(dc/defcard first-card
  (sab/html [:div
             [:h1 "This is your first devcard!"]]))

;;(dc/start-devcard-ui!)
(ns labyrinth.state
  (:require [reagent.core :as r]))

(def cast (r/atom {}))

(def addams (r/atom {:cast-01 {:id :cast-01
                               :firstname "Morticia"
                               :lastname "Addams"
                               :actorname "Carolyn Jones"
                               :talent "Botanist"}
                     :cast-02 {:id :cast-02
                               :firstname "Gomez"
                               :lastname "Addams"
                               :actorname "John Astin"
                               :talent "Finance"}
                     :cast-03 {:id :cast-03
                               :firstname "Fester"
                               :lastname "Addams"
                               :actorname "Jackie Coogan"
                               :talent "Demolition"}}))
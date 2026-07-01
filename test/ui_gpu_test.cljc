(ns ui_gpu-test
  (:require [clojure.test :refer [deftest is testing]]
            [ui_gpu]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? ui_gpu))))

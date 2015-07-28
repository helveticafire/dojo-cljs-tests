(ns dojo.core
	(:require [cljs.test :refer-macros [deftest testing is]]))

(.log js/console "hello world")
 
 (deftest first-test
 	(is (= 1 1)))
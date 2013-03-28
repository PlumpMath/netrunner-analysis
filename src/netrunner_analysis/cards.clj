(ns netrunner-analysis.cards)

(def breakers [{:name "Aurora" :type "sentry" :str 1 :pump-cost 2 :pump-inc 3 :break-cost 2 :break-count 1}
               {:name "Battering Ram" :type "barrier" :str 3 :pump-cost 1 :pump-inc 1 :break-cost 2 :break-count 2}
               {:name "Corroder" :type "barrier" :str 2 :pump-cost 1 :pump-inc 1 :break-cost 1 :break-count 1}
               {:name "Crypsis" :type "all" :str 0 :pump-cost 1 :pump-inc 1 :break-cost 1 :break-count 1}
               {:name "Femme Fatale" :type "sentry" :str 2 :pump-cost 2 :pump-inc 1 :break-cost 1 :break-count 1}
               {:name "Gordian Blade" :type "code gate" :str 2 :pump-cost 1 :pump-inc 1 :break-cost 1 :break-count 1}
               ;{:name "Mimic" :type "sentry" :str 3 :pump-cost 1 :pump-inc 0 :break-cost 1 :break-count 1}
               {:name "Ninja" :type "sentry" :str 0 :pump-cost 3 :pump-inc 5 :break-cost 1 :break-count 1}
               {:name "Pipeline" :type "sentry" :str 1 :pump-cost 2 :pump-inc 1 :break-cost 1 :break-count 1}
               ;{:name "Wyrm" :type "all" :str 2 :pump-cost 1 :pump-inc 1 :break-cost 3 :break-count 1}
               ;{:name "Yog.0" :type "code gate" :str 2 :pump-cost 3 :pump-inc 0 :break-cost 0 :break-count 1}
               ])

(def ices [{:name "Archer" :type "barrier" :str 6 :subs 4}
           {:name "Cell Portal" :type "code gate" :str 7 :subs 1}
           {:name "Chum" :type "code gate" :str 4 :subs 1}
           {:name "Data Mine" :type "trap" :str 2 :subs 1}
           {:name "Data Raven" :type "sentry" :str 4 :subs 1}
           {:name "Enigma" :type "code gate" :str 2 :subs 2}
           {:name "Hadrian's Wall" :type "" :str 7 :subs 2}
           {:name "Heimdall 1.0" :type "barrier" :str 6 :subs 3}
           {:name "Hunter" :type "sentry" :str 4 :subs 1}
           {:name "Ice Wall" :type "barrier" :str 1 :subs 1}
           {:name "Ichi 1.0" :type "sentry" :str 4 :subs 3}
           {:name "Matrix Analyzer" :type "sentry" :str 3 :subs 1}
           {:name "Neural Catana" :type "sentry" :str 3 :subs 1}
           {:name "Rototurret" :type "sentry" :str 0 :subs 2}
           {:name "Shadow" :type "sentry" :str 1 :subs 2}
           {:name "Tollbooth" :type "code gate" :str 5 :subs 1}
           {:name "Victor 1.0" :type "code gate" :str 3 :subs 2}
           {:name "Wall of Static" :type "barrier" :str 3 :subs 1}
           {:name "Wall of Thorns" :type "barrier" :str 5 :subs 2}])
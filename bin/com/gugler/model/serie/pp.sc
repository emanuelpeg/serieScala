package com.gugler.model.serie

import scala.util.Random

object pp {
   val semilla = Random.nextInt(2000);            //> semilla  : Int = 1913
   val l = for(i <- 0 to 3) yield (i * 2 * semilla)
                                                  //> l  : scala.collection.immutable.IndexedSeq[Int] = Vector(0, 3826, 7652, 1147
                                                  //| 8)
   l.seq(0)                                       //> res0: Int = 0
   l.seq(1)                                       //> res1: Int = 3826
   l.seq(2)                                       //> res2: Int = 7652
}
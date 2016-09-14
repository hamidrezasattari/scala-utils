package com.hrsat.sat

import junit.framework.TestCase
import org.junit.Assert._
import com.hrsat.leet.ScalaUtils

/**
  * Created by hamid on 14/08/16.
  */
class TestUtils extends TestCase {

  var utils: ScalaUtils = _

  override def setUp {
    utils = new ScalaUtils
  }

  def testReplace(): Unit = {
    assertEquals(utils.replace("By the power of Grayskull!"), "By 7h3 p0w3r 0f Gr4y5kull!")
  }

}

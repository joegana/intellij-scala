package org.jetbrains.plugins.scala.lang.formatting.settings

/**
  * @author Pavel Fatin
  */
class Binding[T](getLeft: => T, getRight: => T)(setLeft: (T) => Unit, setRight: (T) => Unit) {
  def copyLeftToRight(): Unit = setRight(getLeft)

  def copyRightToLeft(): Unit = setLeft(getRight)

  def leftEqualsRight: Boolean = getLeft == getRight
}

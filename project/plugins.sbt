resolvers += Resolver.url("jetbrains-sbt", url(s"http://dl.bintray.com/jetbrains/sbt-plugins"))(Resolver.ivyStylePatterns)

addSbtPlugin("org.jetbrains" % "sbt-ide-settings" % "0.1.1")
addSbtPlugin("org.jetbrains" % "sbt-idea-plugin" % "1.1.0+23-ae51241f+20180610-1844")
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.2.27")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.7.0")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.0")

// FIXME coursier as a plugin currently breaks tests
//addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-RC3")

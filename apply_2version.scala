// singleton
object Upper {
	def upper(strings: String*) = strings.map(_.toUpperCase())
}

println(Upper.upper("Take", "This", "for", "me!"))

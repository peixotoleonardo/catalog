package shelf.catalog.com.br

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("shelf.catalog.com.br")
		.start()
}


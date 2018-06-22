class A[X, +Y, -Z]
val xxx: A[X, X, X] forSome {type X} = null
val xxy: A[X, X, Y] forSome {type X; type Y} = null
val xyx: A[X, Y, X] forSome {type X; type Y} = null
val xyz: A[X, Y, Z] forSome {type X; type Y; type Z} = null
/*start*/(xxx, xxy, xyx, xyz)/*end*/
//(A[X, X, X] forSome {type X}, A[X, X, Y] forSome {type X; type Y}, A[X, Any, X] forSome {type X}, A[_, Any, _])
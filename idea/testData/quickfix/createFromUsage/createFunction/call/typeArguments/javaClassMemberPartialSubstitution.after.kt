// "Create member function 'B.foo'" "true"
// ERROR: Unresolved reference: foo

class A<T> internal constructor(val b: B<T>) {
    fun test(): Int {
        return b.foo<Int>(2, "2")
    }
}
package top.lolosia.openvr.structs

interface HmdIterable<T>: Iterable<T> {
    val length: Int
    operator fun get(index: Int) : T

    override operator fun iterator() = object : Iterator<T> {
        var i = -1;
        override fun hasNext() = i < length

        override fun next(): T {
            i++
            return get(i)
        }
    }
}
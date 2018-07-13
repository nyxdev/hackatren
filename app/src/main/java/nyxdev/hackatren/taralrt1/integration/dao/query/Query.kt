package nyxdev.hackatren.taralrt1.integration.dao.query

interface Query {
    interface Select
    interface Bool {
        fun isAccountEmpty(): Boolean
    }

    interface Truncate
    interface InsertReplace
}
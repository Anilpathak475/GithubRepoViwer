package com.codechallenge.authenteq.utils

import com.codechallenge.authenteq.model.Filters

fun convertFilterToIndex(filter: Filters.ResultSearchUsers) = when (filter) {
    Filters.ResultSearchUsers.BY_SCORE -> 2
    Filters.ResultSearchUsers.BY_FOLLOWERS -> 1
    Filters.ResultSearchUsers.BY_REPOS -> 0
}

fun convertIndexToFilter(index: Int) = when (index) {
    2 -> Filters.ResultSearchUsers.BY_SCORE
    1 -> Filters.ResultSearchUsers.BY_FOLLOWERS
    0 -> Filters.ResultSearchUsers.BY_REPOS
    else -> throw IllegalStateException("Index not recognized")
}
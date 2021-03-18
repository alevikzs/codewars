package com.alevikzs.codewars;

import java.util.List;

/**
 * https://www.codewars.com/kata/515bb423de843ea99400000a
 */
public final class PaginationHelper<I> {

    private final List<I> collection;
    private final int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(final List<I> collection, final int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (int) Math.ceil((double) this.itemCount() / this.itemsPerPage);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(final int pageIndex) {
        final int itemsPerPages = (pageIndex + 1) * this.itemsPerPage;

        if (this.pageCount() - 1 < pageIndex) {
            return -1;
        }

        if (itemsPerPages <= this.itemCount()) {
            return this.itemsPerPage;
        }

        return this.itemsPerPage - itemsPerPages + this.itemCount();
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(final int itemIndex) {
        if (itemIndex + 1 > this.itemCount() || itemIndex < 0) {
            return -1;
        }

        return (int) Math.ceil((float) (itemIndex + 1) / this.itemsPerPage) - 1;
    }

}

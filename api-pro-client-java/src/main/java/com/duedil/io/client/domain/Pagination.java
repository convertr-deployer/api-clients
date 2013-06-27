package com.duedil.io.client.domain;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client.domain
 */
public class Pagination {

    private int limit;
    private int offset;
    private int total;
    private String query;

    private boolean last;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "Pagination{" +
                "limit=" + limit +
                ", offset=" + offset +
                ", total=" + total +
                ", query='" + query + '\'' +
                ", last=" + last +
                '}';
    }
}

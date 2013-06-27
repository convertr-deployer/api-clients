package com.duedil.io.client.entity;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Date: 29/05/2013
 */
public class DuedilRayDirectorStats {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private int secretaryTotal;

    public int getSecretaryTotal() {
        return secretaryTotal;
    }

    public void setSecretaryTotal(int secretaryTotal) {
        this.secretaryTotal = secretaryTotal;
    }

    private int directorTotal;

    public int getDirectorTotal() {
        return directorTotal;
    }

    public void setDirectorTotal(int directorTotal) {
        this.directorTotal = directorTotal;
    }

    private int openTotal;

    public int getOpenTotal() {
        return openTotal;
    }

    public void setOpenTotal(int openTotal) {
        this.openTotal = openTotal;
    }

    private int openSecretaryTotal;

    public int getOpenSecretaryTotal() {
        return openSecretaryTotal;
    }

    public void setOpenSecretaryTotal(int openSecretaryTotal) {
        this.openSecretaryTotal = openSecretaryTotal;
    }

    private int openDirectorTotal;

    public int getOpenDirectorTotal() {
        return openDirectorTotal;
    }

    public void setOpenDirectorTotal(int openDirectorTotal) {
        this.openDirectorTotal = openDirectorTotal;
    }

    private int openTradingTotal;

    public int getOpenTradingTotal() {
        return openTradingTotal;
    }

    public void setOpenTradingTotal(int openTradingTotal) {
        this.openTradingTotal = openTradingTotal;
    }

    private int openSecretaryTradingTotal;

    public int getOpenSecretaryTradingTotal() {
        return openSecretaryTradingTotal;
    }

    public void setOpenSecretaryTradingTotal(int openSecretaryTradingTotal) {
        this.openSecretaryTradingTotal = openSecretaryTradingTotal;
    }

    private int openDirectorTradingTotal;

    public int getOpenDirectorTradingTotal() {
        return openDirectorTradingTotal;
    }

    public void setOpenDirectorTradingTotal(int openDirectorTradingTotal) {
        this.openDirectorTradingTotal = openDirectorTradingTotal;
    }

    private int closedTotal;

    public int getClosedTotal() {
        return closedTotal;
    }

    public void setClosedTotal(int closedTotal) {
        this.closedTotal = closedTotal;
    }

    private int closedSecretaryTotal;

    public int getClosedSecretaryTotal() {
        return closedSecretaryTotal;
    }

    public void setClosedSecretaryTotal(int closedSecretaryTotal) {
        this.closedSecretaryTotal = closedSecretaryTotal;
    }

    private int closedDirectorTotal;

    public int getClosedDirectorTotal() {
        return closedDirectorTotal;
    }

    public void setClosedDirectorTotal(int closedDirectorTotal) {
        this.closedDirectorTotal = closedDirectorTotal;
    }

    private int closedTradingTotal;

    public int getClosedTradingTotal() {
        return closedTradingTotal;
    }

    public void setClosedTradingTotal(int closedTradingTotal) {
        this.closedTradingTotal = closedTradingTotal;
    }

    private int closedSecretaryTradingTotal;

    public int getClosedSecretaryTradingTotal() {
        return closedSecretaryTradingTotal;
    }

    public void setClosedSecretaryTradingTotal(int closedSecretaryTradingTotal) {
        this.closedSecretaryTradingTotal = closedSecretaryTradingTotal;
    }

    private int closedDirectorTradingTotal;

    public int getClosedDirectorTradingTotal() {
        return closedDirectorTradingTotal;
    }

    public void setClosedDirectorTradingTotal(int closedDirectorTradingTotal) {
        this.closedDirectorTradingTotal = closedDirectorTradingTotal;
    }

    private int retiredTotal;

    public int getRetiredTotal() {
        return retiredTotal;
    }

    public void setRetiredTotal(int retiredTotal) {
        this.retiredTotal = retiredTotal;
    }

    private int retiredSecretaryTotal;

    public int getRetiredSecretaryTotal() {
        return retiredSecretaryTotal;
    }

    public void setRetiredSecretaryTotal(int retiredSecretaryTotal) {
        this.retiredSecretaryTotal = retiredSecretaryTotal;
    }

    private int retiredDirectorTotal;

    public int getRetiredDirectorTotal() {
        return retiredDirectorTotal;
    }

    public void setRetiredDirectorTotal(int retiredDirectorTotal) {
        this.retiredDirectorTotal = retiredDirectorTotal;
    }

    private int retiredTradingTotal;

    public int getRetiredTradingTotal() {
        return retiredTradingTotal;
    }

    public void setRetiredTradingTotal(int retiredTradingTotal) {
        this.retiredTradingTotal = retiredTradingTotal;
    }

    private int retiredSecretaryTradingTotal;

    public int getRetiredSecretaryTradingTotal() {
        return retiredSecretaryTradingTotal;
    }

    public void setRetiredSecretaryTradingTotal(int retiredSecretaryTradingTotal) {
        this.retiredSecretaryTradingTotal = retiredSecretaryTradingTotal;
    }

    private int retiredDirectorTradingTotal;

    public int getRetiredDirectorTradingTotal() {
        return retiredDirectorTradingTotal;
    }

    public void setRetiredDirectorTradingTotal(int retiredDirectorTradingTotal) {
        this.retiredDirectorTradingTotal = retiredDirectorTradingTotal;
    }

    private Timestamp dataset;

    public Timestamp getDataset() {
        return dataset;
    }

    public void setDataset(Timestamp dataset) {
        this.dataset = dataset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DuedilRayDirectorStats that = (DuedilRayDirectorStats) o;

        if (closedDirectorTotal != that.closedDirectorTotal) return false;
        if (closedDirectorTradingTotal != that.closedDirectorTradingTotal) return false;
        if (closedSecretaryTotal != that.closedSecretaryTotal) return false;
        if (closedSecretaryTradingTotal != that.closedSecretaryTradingTotal) return false;
        if (closedTotal != that.closedTotal) return false;
        if (closedTradingTotal != that.closedTradingTotal) return false;
        if (directorTotal != that.directorTotal) return false;
        if (openDirectorTotal != that.openDirectorTotal) return false;
        if (openDirectorTradingTotal != that.openDirectorTradingTotal) return false;
        if (openSecretaryTotal != that.openSecretaryTotal) return false;
        if (openSecretaryTradingTotal != that.openSecretaryTradingTotal) return false;
        if (openTotal != that.openTotal) return false;
        if (openTradingTotal != that.openTradingTotal) return false;
        if (retiredDirectorTotal != that.retiredDirectorTotal) return false;
        if (retiredDirectorTradingTotal != that.retiredDirectorTradingTotal) return false;
        if (retiredSecretaryTotal != that.retiredSecretaryTotal) return false;
        if (retiredSecretaryTradingTotal != that.retiredSecretaryTradingTotal) return false;
        if (retiredTotal != that.retiredTotal) return false;
        if (retiredTradingTotal != that.retiredTradingTotal) return false;
        if (secretaryTotal != that.secretaryTotal) return false;
        if (dataset != null ? !dataset.equals(that.dataset) : that.dataset != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + secretaryTotal;
        result = 31 * result + directorTotal;
        result = 31 * result + openTotal;
        result = 31 * result + openSecretaryTotal;
        result = 31 * result + openDirectorTotal;
        result = 31 * result + openTradingTotal;
        result = 31 * result + openSecretaryTradingTotal;
        result = 31 * result + openDirectorTradingTotal;
        result = 31 * result + closedTotal;
        result = 31 * result + closedSecretaryTotal;
        result = 31 * result + closedDirectorTotal;
        result = 31 * result + closedTradingTotal;
        result = 31 * result + closedSecretaryTradingTotal;
        result = 31 * result + closedDirectorTradingTotal;
        result = 31 * result + retiredTotal;
        result = 31 * result + retiredSecretaryTotal;
        result = 31 * result + retiredDirectorTotal;
        result = 31 * result + retiredTradingTotal;
        result = 31 * result + retiredSecretaryTradingTotal;
        result = 31 * result + retiredDirectorTradingTotal;
        result = 31 * result + (dataset != null ? dataset.hashCode() : 0);
        return result;
    }
}

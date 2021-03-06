package com.inna.shpota.periodicals.dao;

import com.inna.shpota.periodicals.dao.jdbc.*;

import javax.sql.DataSource;

public class DaoFactory {
    public static AdminDao createAdminDao(DataSource dataSource) {
        return new JdbcAdminDao(dataSource);
    }

    public static PeriodicalsDao createPeriodicalsDao(DataSource dataSource) {
        return new JdbcPeriodicalsDao(dataSource);
    }

    public static ReaderDao createReaderDao(DataSource dataSource) {
        return new JdbcReaderDao(dataSource);
    }

    public static SubscriptionDao createSubscriptionDao(DataSource dataSource) {
        return new JdbcSubscriptionDao(dataSource);
    }

    public static PaymentDao createPaymentDao(DataSource dataSource) {
        return new JdbcPaymentDao(dataSource);
    }
}

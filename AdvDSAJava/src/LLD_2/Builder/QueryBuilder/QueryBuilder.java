package LLD_2.Builder.QueryBuilder;

import LLD_2.Builder.MessageBuilder.WithBuilder;

@WithBuilder
public class QueryBuilder {

    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;

    public QueryBuilder(Builder buildeObj) {

        this.select = buildeObj.getSelect();
        this.from = buildeObj.getFrom();
        this.where = buildeObj.getWhere();
        this.join = buildeObj.getJoin();
        this.orderBy = buildeObj.getOrderBy();
        this.groupBy = buildeObj.getGroupBy();

    }

    public static Builder getBuilder() {
        return new Builder();
    }


    public static class Builder{
        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;

        public String getSelect() {
            return select;
        }

        public void setSelect(String select) {
            this.select = select;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getWhere() {
            return where;
        }

        public void setWhere(String where) {
            this.where = where;
        }

        public String getJoin() {
            return join;
        }

        public void setJoin(String join) {
            this.join = join;
        }

        public String getOrderBy() {
            return orderBy;
        }

        public void setOrderBy(String orderBy) {
            this.orderBy = orderBy;
        }

        public String getGroupBy() {
            return groupBy;
        }

        public void setGroupBy(String groupBy) {
            this.groupBy = groupBy;
        }

        public QueryBuilder build() {
            return new QueryBuilder(this);
        }
    }


}

package com.sunwoda.entity;

/**
 * 类描述：
 *
 * @ClassName PageModel
 * @Description TODO
 * @Author shiguorang
 * @Date 2021/3/21 21:07
 * @Version 1.0
 */
public class PageModel{

    private int pageNumber;

    private int pageSize;

    private int total;

    public PageModel (){
        System.out.println("PageModel构造函数");
    }

    static {
        System.out.println("PageModel静态代码块");
    }
    {
        System.out.println("PageModel初始化代码块");
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "PageModel{" +
                "pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", total=" + total +
                '}';
    }
}

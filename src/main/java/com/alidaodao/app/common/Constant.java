package com.alidaodao.app.common;

import com.alidaodao.app.model.Book;
import org.assertj.core.util.Lists;

import java.util.List;

/**
 *
 * @desc 常量
 * @author bosong
 * @date 2020/9/28 18:57
 */
public class Constant {
    public static List<Book> BOOKS = Lists.newArrayList(
            new Book(1, "战争与和平", "列夫·尼古拉耶维奇·托尔斯泰", 100),
            new Book(2, "西游记", "吴承恩", 1000),
            new Book(3, "三国演义", "罗贯中", 1999),
            new Book(4, "水浒传", "施耐庵", 299));
}

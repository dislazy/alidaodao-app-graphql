package com.alidaodao.app.resolver;

import com.alidaodao.app.model.Book;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.assertj.core.util.Lists;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

/**
 *
 * @desc
 * @author bosong
 * @date 2020/9/28 14:40
 */
@Component
public class BookQuery implements GraphQLQueryResolver {

    private static List<Book> books = Lists.newArrayList(
            new Book(1, "战争与和平", "列夫·尼古拉耶维奇·托尔斯泰", 100),
            new Book(2, "西游记", "吴承恩", 1000),
            new Book(3, "三国演义", "罗贯中", 1999),
            new Book(4, "水浒传", "施耐庵", 299));

    public List<Book> books() {
        return books;
    }

    public Optional<Book> book(Integer id) {
        return books().stream().filter(e -> e.getId().equals(id)).findFirst();
    }

}

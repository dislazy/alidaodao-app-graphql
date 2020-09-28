package com.alidaodao.app.resolver;

import com.alidaodao.app.common.Constant;
import com.alidaodao.app.model.Book;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

/**
 *
 * @desc 查询
 * @author bosong
 * @date 2020/9/28 14:40
 */
@Component
public class BookQuery implements GraphQLQueryResolver {


    public List<Book> books() {
        return Constant.BOOKS;
    }

    public Optional<Book> book(Integer id) {
        return Constant.BOOKS
                .stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();
    }

}

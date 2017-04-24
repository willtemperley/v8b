package io.temperley;

import io.reactivex.Flowable;
import org.junit.Test;

import java.util.List;

/**
 * Created by will on 16/04/2017.
 */
public class TestFlowable {

    LinkDAO linkDAO = new LinkDAO();

    @Test
    public void test() {
        List<Link> list = linkDAO.list();
        Flowable<List<Link>> listFlowable = Flowable.just(list);

        listFlowable.subscribe(System.out::println);


        Link link = new Link();
        link.setUrl("new link");

        Flowable<Link> just = Flowable.just(link);

    }

}

package com.example.practicedemo.formAPI.repo;

import com.example.practicedemo.formAPI.model.Model;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class Repo {
    private List<Model> list = new ArrayList<Model>();


    /*
    public void createProducts() {
        list = List.of(
                new Model(1, "product 1", 10, 1000),
                new Model(2, "product 2", 20, 2000),
                new Model(3, "product 3", 30, 3000)
        );
    }

*/

    public List<Model> getAllProducts() {
        return list;
    }

    public Model findById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == (id)) {
                return list.get(i);
            }
        }
        return null;
    }

    public List<Model> search(String title) {
        return list.stream().filter(x -> x.getTitle().startsWith(title)).collect(Collectors.toList());
    }

    public Model save(Model d) {

        Model note = new Model();
        d.setAtomicId();
        d.setLocalDate();
        d.setLocalDateDone();
        note.setId(d.getId());
        note.setTitle(d.getTitle());
        note.setDueDate(d.getDueDate());
        note.setDone(d.getDone());
        note.setDoneDate(d.getDoneDate());
        note.setCreationDate(d.getCreationDate());
        note.setPriority(d.getPriority());

        list.add(note);
        return note;
    }

    public String delete(Integer id) {
        list.removeIf(x -> x.getId() == (id));
        return null;
    }

    public Model update(Model product) {
        int idx = 0;
        int id = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == (product.getId())) {
                id = product.getId();
                idx = i;
                break;
            }
        }
        Model product1 = new Model();
        /*
        *  this.id = id;
        this.title = title;
        this.dueDate = dueDate;
        this.done = done;
        this.doneDate = doneDate;
        this.creationDate = creationDate;
        this.priority = priority;
        *
        * */

        product1.setId(product.getId());
        product1.setTitle(product.getTitle());
        product1.setDueDate(product.getDueDate());
        product1.setDone(product.getDone());
        product1.setDoneDate(product.getDoneDate());
        product1.setPriority(product.getPriority());
        list.set(idx, product);

        return product1;

    };




    public Model isDone(Model product) {
        int idx = 0;
        int id = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == (product.getId())) {
                id = product.getId();
                idx = i;
                break;
            }
        }
        Model product1 = new Model();
        /*
        *  this.id = id;
        this.title = title;
        this.dueDate = dueDate;
        this.done = done;
        this.doneDate = doneDate;
        this.creationDate = creationDate;
        this.priority = priority;
        *
        * */
        product1.setLocalDateDone();
        product1.setId(product.getId());
       // product1.setTitle(product.getTitle());
       //   product1.setDueDate(product.getDueDate());
        //product1.setDone(product.getDone());
       product1.setDoneDate(product.getDoneDate());
       // product1.setPriority(product.getPriority());
        list.set(idx, product);

        return product1;

    };

    /*public Model UPDATE(Model model){
        //find the current id

        Model oldNote = list.stream().filter(c -> c.getId() == model.getId()).findAny().get();
        list.remove(oldNote);


    };*/
}

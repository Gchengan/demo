package com.study.controller;


import com.study.pojo.Gen;
import com.study.pojo.R;
import com.study.service.GenServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gen")
public class GenController {
    @Autowired
    private GenServices genServices;
    @GetMapping
public R getAll(){
    return genServices.getAll();
}
@GetMapping("{id}")
    public R getById(@PathVariable Integer id){
    System.out.println("getbyId调用");
        return genServices.getById(id);
}
@PostMapping
    public R insert(@RequestBody Gen gen){
        return genServices.insert(gen);
}
@PutMapping
    public R update(@RequestBody Gen gen){
        return genServices.update(gen);
}
@DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return genServices.delete(id);
}
}

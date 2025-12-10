package com.marvellous.MarvellousPortal.controller;

import com.marvellous.MarvellousPortal.Entity.BatchEntry;
import com.marvellous.MarvellousPortal.Repository.BatchEntryRepository;
import com.marvellous.MarvellousPortal.service.BatchEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/batches")
public class BatchEntryController
{

    @Autowired
    private BatchEntryService batchEntryService;

    @GetMapping
    public ResponseEntity<?> getAll() //?--generic code ahe atta datatype mahit nhi
    {
        List<BatchEntry> allData = batchEntryService.getAll();

        if((allData !=null)&& !allData.isEmpty())
        {
            return  new ResponseEntity<>(allData, HttpStatus.OK);

        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @PostMapping
    public ResponseEntity<BatchEntry> createEntry(@RequestBody BatchEntry myentry)
    {
        try
        {
            batchEntryService.saveEntry( myentry);
            return new  ResponseEntity<BatchEntry>(myentry,HttpStatus.CREATED);

        }
        catch (Exception eobj)
        {
            return  new ResponseEntity< BatchEntry>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/id/{myid}")
    public ResponseEntity<BatchEntry> getbatchentryById(@PathVariable ObjectId  myid)
     {
         Optional<BatchEntry> batchEntry= batchEntryService.findById(myid);
         if(batchEntry.isPresent())
         {
             return  new ResponseEntity<BatchEntry>(batchEntry.get(),HttpStatus.OK);

         }
         else
         {
             return  new ResponseEntity<BatchEntry>(HttpStatus.NOT_FOUND);
         }
     }


    @DeleteMapping("/id/{myid}")
    public ResponseEntity<?> deleteEntryById(@PathVariable ObjectId myid)
    {
        batchEntryService.deleteById(myid);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @PutMapping ("/id/{myid}")
    public ResponseEntity<?> updateEntryById(@PathVariable ObjectId myid,@RequestBody BatchEntry myentry)
    {
        BatchEntry old  = batchEntryService.findById(myid).orElse(null);
        if (old != null)
        {
            old.setName(myentry.getName());
            old.setFees(myentry.getFees());

            batchEntryService.saveEntry(old);

            return new ResponseEntity<>(old,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }


    }

     }














/*
Explain client server architecture?
Explain request response model?
 Explain http?
Explain socket programming?
Explain chat messanger?
Explain fullstack architecture?
Explain Server side architecture of spring boot?
Explain Project struture spring boot?
maven
build process of spring boot?
how end point get handle in Spring boot(spring boot)?
RESTAPI?
concept of annotation in SB?
spring bean?
bean Container?
---------------------------------------------
ORM
JPA
HYBERNATE
---------------------------------------------
client(Postman) ->  server(Spring boot)  ->  Database(Virtual)

//////////////////////////////////////////////////////////////////////////////////////////////////////
sql---------->     mongoDB

database---------->database
table---------->   Collection
column---------->  Field
row---------->     Document
primary key---------->_id field

mongo CUI  install
mongo compass install

 */























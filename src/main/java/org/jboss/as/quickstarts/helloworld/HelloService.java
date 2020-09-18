/*
 * JBoss, Home of Professional Open Source
 * Copyright 2015, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.as.quickstarts.helloworld;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.*;
import java.lang.management.ManagementFactory;


/**
 * A simple CDI service which is able to say hello to someone
 *
 * @author Pete Muir
 *
 */
public class HelloService {

    String createHelloMessage(String name) {
      System.out.println("hello poonam");
        return "Hello " + name + "!";
          System.out.println("****************************");
        System.out.println("Serialization is under way.");
        System.out.println("Counter = " + this.counter);
        System.out.println("****************************");
    }
    String showlist(List<String> list1) {
        return "Hello " + list1 + "!";
    }



      //  String fullVMArguments() {
      //   String name = javaVmName();
      //   //System.out.println("vm argu=="+ ManagementFactory.getRuntimeMXBean().getInputArguments());
      //   return (contains(name, "Server") ? "-server "
      //     : contains(name, "Client") ? "-client " : "")
      //     + joinWithSpace(vmArguments());
      // }

       List<String> vmArguments() {
           System.out.println("vm argu=="+ ManagementFactory.getRuntimeMXBean().getInputArguments());

        return ManagementFactory.getRuntimeMXBean().getInputArguments();
      }

      //  boolean contains(String s, String b) {
      //      System.out.println("vm argu contains=="+s + b);
      //   return s != null && s.indexOf(b) >= 0;
      //
      //  }
      //
      //  String javaVmName() {
      //   return System.getProperty("java.vm.name");
      //
      // }
      //
      //   String joinWithSpace(Collection<String> c) {
      //
      //   return join(" ", c);
      //  }
      //
      // public static String join(String glue, Iterable<String> strings) {
      //   if (strings == null) return "";
      //   StringBuilder buf = new StringBuilder();
      //   Iterator<String> i = strings.iterator();
      //   if (i.hasNext()) {
      //     buf.append(i.next());
      //     while (i.hasNext())
      //       buf.append(glue).append(i.next());
      //   }
      //   return buf.toString();
      // }


    }

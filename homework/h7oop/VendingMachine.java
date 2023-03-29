package org.example.homework.h7oop;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {

    Product getProduct(String name) throws IllegalStateException;

}

package modelo;

import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public enum Estado implements ObservableList<Estado> {
       NUEVO,USADO,PUBLICADO,VENDIDO,CANCELADO, NULL;

       @Override
       public void addListener(ListChangeListener<? super Estado> listChangeListener) {

       }

       @Override
       public void removeListener(ListChangeListener<? super Estado> listChangeListener) {

       }

       @Override
       public boolean addAll(Estado... estados) {
              return false;
       }

       @Override
       public boolean setAll(Estado... estados) {
              return false;
       }

       @Override
       public boolean setAll(Collection<? extends Estado> collection) {
              return false;
       }

       @Override
       public boolean removeAll(Estado... estados) {
              return false;
       }

       @Override
       public boolean retainAll(Estado... estados) {
              return false;
       }

       @Override
       public void remove(int i, int i1) {

       }

       @Override
       public int size() {
              return 0;
       }

       @Override
       public boolean isEmpty() {
              return false;
       }

       @Override
       public boolean contains(Object o) {
              return false;
       }

       @Override
       public Iterator<Estado> iterator() {
              return null;
       }

       @Override
       public Object[] toArray() {
              return new Object[0];
       }

       @Override
       public <T> T[] toArray(T[] a) {
              return null;
       }

       @Override
       public boolean add(Estado estado) {
              return false;
       }

       @Override
       public boolean remove(Object o) {
              return false;
       }

       @Override
       public boolean containsAll(Collection<?> c) {
              return false;
       }

       @Override
       public boolean addAll(Collection<? extends Estado> c) {
              return false;
       }

       @Override
       public boolean addAll(int index, Collection<? extends Estado> c) {
              return false;
       }

       @Override
       public boolean removeAll(Collection<?> c) {
              return false;
       }

       @Override
       public boolean retainAll(Collection<?> c) {
              return false;
       }

       @Override
       public void clear() {

       }

       @Override
       public Estado get(int index) {
              return null;
       }

       @Override
       public Estado set(int index, Estado element) {
              return null;
       }

       @Override
       public void add(int index, Estado element) {

       }

       @Override
       public Estado remove(int index) {
              return null;
       }

       @Override
       public int indexOf(Object o) {
              return 0;
       }

       @Override
       public int lastIndexOf(Object o) {
              return 0;
       }

       @Override
       public ListIterator<Estado> listIterator() {
              return null;
       }

       @Override
       public ListIterator<Estado> listIterator(int index) {
              return null;
       }

       @Override
       public List<Estado> subList(int fromIndex, int toIndex) {
              return null;
       }

       @Override
       public void addListener(InvalidationListener invalidationListener) {

       }

       @Override
       public void removeListener(InvalidationListener invalidationListener) {

       }
}

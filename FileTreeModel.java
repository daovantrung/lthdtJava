/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong5.logic;

import java.io.File;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author macbookair
 */
public class FileTreeModel implements TreeModel {
     DefaultTreeModel tree;
    DefaultMutableTreeNode rootNode;
    
   public FileTreeModel(String rootDir){
       rootNode = new DefaultMutableTreeNode(new File(rootDir));
       
       
       
       buildDirectoryTree(rootNode, rootDir);
       tree = new DefaultTreeModel(rootNode);
   }

    private void buildDirectoryTree(DefaultMutableTreeNode node, String rootDir) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    File curDir = new File(rootDir);
  //  DefaultMutableTreeNode root =  new DefaultMutableTreeNode(curDir);
    if(!curDir.isDirectory()){
        return;
    }
    File[] list = curDir.listFiles();
    for(int i = 0;i<list.length;i++){
        DefaultMutableTreeNode child = new DefaultMutableTreeNode(list[i]);
        node.add(child);
        buildDirectoryTree(child,rootDir+File.separator+list[i].getName());
        
    }
    
    }

    
    
 @Override
    public Object getRoot() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return this.rootNode;
    }

    @Override
    public Object getChild(Object parent, int index) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return tree.getChild(parent, index);
    }

    @Override
    public int getChildCount(Object parent) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return tree.getChildCount(parent);
    
    }

    @Override
    public boolean isLeaf(Object node) {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return tree.isLeaf(node);
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    tree.valueForPathChanged(path, newValue);
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
     //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return tree.getIndexOfChild(parent, child);
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    tree.addTreeModelListener(l);
    }
@Override
    public void removeTreeModelListener(TreeModelListener l) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    tree.removeTreeModelListener(l);
    }    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.bean.DanhMucBean;
import com.mycompany.view.KH.QuanLyMuonKHJPanel;
import com.mycompany.view.KH.QuanLyTraKHJPanel;
import com.mycompany.view.KH.ThongTinKHJPanel;
import com.mycompany.view.KH.TrangChinhJPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author khang
 */
public class ChuyenManHinhControllerKH {
    
    private JPanel root;
    private String kindSelected="";
    private List<DanhMucBean> listItem = null;

    public ChuyenManHinhControllerKH(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    
    public void setDashboard(JPanel jpnItem, JLabel jlbItem) {
       kindSelected = "TrangChinh";
       jpnItem.setBackground(new Color(96, 100, 191));
       jlbItem.setBackground(new Color(96, 100, 191));
       JPanel node = new TrangChinhJPanel();
       root.removeAll();
       root.setLayout(new BorderLayout());
       root.add(node);
       root.validate();
       root.repaint();
}

    public void setView(JPanel jpnItem, JLabel jlbItem){
        kindSelected = "TrangChu";
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChinhJPanel());
        root.validate();
        root.repaint();
    }
    
    public void setEvent(List<DanhMucBean> listItem){
        this.listItem = listItem;
        for(DanhMucBean item: listItem){
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
    
        }
        
    }
    class LabelEvent implements MouseListener{
        private JPanel node;
        private String kind;

        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent( String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
        

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "TrangChinh":
                    node = new TrangChinhJPanel();
                    break;
                case "QuanLyMuon":
                    node = new QuanLyMuonKHJPanel();
                    break;
                case "QuanLyTra":
                    node = new QuanLyTraKHJPanel();
                    break;
                case "ThongTinTaiKhoan":
                    node = new ThongTinKHJPanel();
                    break;
                // more
                default:
                    break;
           }
           root.removeAll();
           root.setLayout(new BorderLayout());
           root.add(node);
           root.validate();
           root.repaint();
            setChangeBackGround(kind);
            
        }

         @Override
      public void mousePressed(MouseEvent e) {
           kindSelected = kind;
           jpnItem.setBackground(new Color(0,0,0));
           jlbItem.setBackground(new Color(0,0,0));
      }

      @Override
      public void mouseReleased(MouseEvent e) {

      }

      @Override
      public void mouseEntered(MouseEvent e) {
          jpnItem.setBackground(new Color(0,0,0));
          jlbItem.setBackground(new Color(0,0,0));
      }

      @Override
      public void mouseExited(MouseEvent e) {
          if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(51,51,51));
                jlbItem.setBackground(new Color(51,51,51));
          }
      }
        
    }
    private void setChangeBackGround(String kind){
        for(DanhMucBean item: listItem){
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJpn().setBackground(new Color(0,0,0));
                item.getJlb().setBackground(new Color(0,0,0));
            } else{
                item.getJpn().setBackground(new Color(51,51,51));
                item.getJlb().setBackground(new Color(51,51,51));
            }
            
        }
        
    }
}

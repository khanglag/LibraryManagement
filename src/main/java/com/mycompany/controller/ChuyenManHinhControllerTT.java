/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.bean.DanhMucBean;
import com.mycompany.view.employee.NhaXuatBanJPanel;
import com.mycompany.view.employee.NhapHangJPanel;
import com.mycompany.view.employee.PhieuMuonJPanel;
import com.mycompany.view.employee.QuanLyDocGiaJPanel;
import com.mycompany.view.employee.QuanLyMuonJPanel;
import com.mycompany.view.employee.QuanLyNhaCungCapJPanel;
import com.mycompany.view.employee.QuanLySachJPanel;
import com.mycompany.view.employee.QuanLyTacGiaJPanel;
import com.mycompany.view.employee.ThongKeJPanel;
import com.mycompany.view.employee.ThongTinTaiKhoanJPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import com.mycompany.view.employee.TrangChinhJPanel;

/**
 *
 * @author khang
 */
public class ChuyenManHinhControllerTT {
    
    private JPanel root;
    private String kindSelected="";
    private List<DanhMucBean> listItem = null;

    public ChuyenManHinhControllerTT(JPanel jpnRoot) {
        this.root = jpnRoot;
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
                case "Sach":
                    node = new QuanLySachJPanel();
                    break;
                case "DocGia":
                    node = new QuanLyDocGiaJPanel();
                    break;
                case "TacGia":
                    node = new QuanLyTacGiaJPanel();
                    break;
                case "NhaXuatBan":
                    node = new NhaXuatBanJPanel();
                    break;
                case "QuanLyMuon":
                    node = new QuanLyMuonJPanel();
                    break;
                case "PhieuMuon":
                    node = new PhieuMuonJPanel();
                    break;
                case "PhieuNhap":
                    node = new NhapHangJPanel();
                    break;
                case "ThongKe":
                    node = new ThongKeJPanel();
                    break;
                case "ThongTinTaiKhoan":
                    node = new ThongTinTaiKhoanJPanel();
                    break;
                case "NhaCungCap":
                    node = new QuanLyNhaCungCapJPanel();
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

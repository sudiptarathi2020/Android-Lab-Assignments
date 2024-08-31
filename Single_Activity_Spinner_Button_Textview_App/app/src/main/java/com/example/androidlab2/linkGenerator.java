package com.example.androidlab2;
import java.util.ArrayList;
import java.util.List;
public class linkGenerator {
    List<String > getLinks(String distro){
        List<String >links=new ArrayList<>();
        if(distro.equals("Ubuntu")){
            links.add("https://ubuntu.com/download/desktop/thank-you?version=24.04&architecture=amd64&lts=true");
        }else if(distro.equals("Fedora")){
            links.add("https://fedoraproject.org/workstation/download");
        }else if(distro.equals("Kali Linux")){
            links.add("https://cdimage.kali.org/kali-2024.2/kali-linux-2024.2-installer-amd64.iso");
        }else if(distro.equals("Linux Mint")){
            links.add("https://linuxmint.com/edition.php?id=316");
        }else if(distro.equals("Manjaro")){
            links.add("https://download.manjaro.org/gnome/24.0.6/manjaro-gnome-24.0.6-240812-linux69.iso");
            links.add("https://download.manjaro.org/kde/24.0.6/manjaro-kde-24.0.6-240812-linux69.iso");
            links.add("https://download.manjaro.org/xfce/24.0.6/manjaro-xfce-24.0.6-240812-linux69.iso");
        }else if(distro.equals("Lubuntu")){
            links.add("https://cdimage.ubuntu.com/lubuntu/releases/24.04/release/lubuntu-24.04-desktop-amd64.iso");
        }else if(distro.equals("Arch Linux")){
            links.add("https://mirror.4v1.in/archlinux/$repo/os/$arch");
            links.add("https://mirrors.abhy.me/archlinux/$repo/os/$arch");
            links.add("https://mirror.albony.in/archlinux/$repo/os/$arch");
            links.add("https://in-mirror.garudalinux.org/archlinux/$repo/os/$arch");
        }
        return links;
    }
}

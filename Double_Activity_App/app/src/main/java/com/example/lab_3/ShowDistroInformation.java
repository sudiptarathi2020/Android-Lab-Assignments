package com.example.lab_3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class ShowDistroInformation extends AppCompatActivity {


    public static final String EXTRA_MESSAGE = "distroname";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_distro_information);
        Intent intent =getIntent();
        String messageText= intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView= findViewById(R.id.information);
        String informationDistro;
        assert messageText != null;
        if(messageText.equalsIgnoreCase("ubuntu")){
            informationDistro="A widely-used Linux distribution developed by Canonical Ltd., known for its user-friendliness and regular updates. It features the GNOME desktop environment by default and is available in several flavors with different desktop environments. Ubuntu is favored for its ease of use, robust community support, and extensive software repositories.";
        }else if(messageText.equalsIgnoreCase("fedora")){
            informationDistro="A cutting-edge Linux distribution sponsored by Red Hat and developed by the Fedora Project. It focuses on incorporating the latest technologies and is community-driven. Fedora offers various editions tailored for different use cases, including workstations, servers, and IoT devices.";
        }else if(messageText.equalsIgnoreCase("archlinux")){
            informationDistro="A minimalist and highly customizable distribution that follows the KISS (Keep It Simple, Stupid) principle. Arch Linux uses a rolling release model and provides a base system that users can build upon, allowing for extensive customization. It is known for its advanced user control and detailed documentation.";
        }else if(messageText.equalsIgnoreCase("linuxmint")){
            informationDistro="Based on Ubuntu, Linux Mint is known for its user-friendly interface and stability. It offers three main desktop environments—Cinnamon, MATE, and Xfce—each designed to provide a familiar and accessible computing experience with a traditional desktop layout.";
        }else if(messageText.equalsIgnoreCase("debian")){
            informationDistro="One of the oldest and most stable Linux distributions, Debian is known for its rigorous testing and extensive software repositories. It serves as the foundation for several other distributions, including Ubuntu. Debian emphasizes stability and reliability, making it a popular choice for servers and critical systems.";
        }else if(messageText.equalsIgnoreCase("opensuse")){
            informationDistro="A versatile Linux distribution known for its ease of use and powerful administration tools. It offers two main versions: openSUSE Leap, which is more stable and geared towards enterprises, and openSUSE Tumbleweed, which follows a rolling release model with the latest software.";
        }else if(messageText.equalsIgnoreCase("manjaro")){
            informationDistro="An Arch-based distribution that aims to provide a more user-friendly experience while retaining the power of Arch Linux. Manjaro includes a graphical installer and pre-configured desktop environments, making it easier for users to get started with an Arch-based system.";
        }else if(messageText.equalsIgnoreCase("elementaryos")){
            informationDistro="A visually appealing distribution based on Ubuntu, known for its focus on design and user experience. It features the Pantheon desktop environment, which is designed to be intuitive and aesthetically pleasing, providing a macOS-like experience";
        }else if(messageText.equalsIgnoreCase("kali-linux")){
            informationDistro="A specialized distribution based on Debian, designed for security professionals and ethical hackers. Kali Linux comes with a comprehensive suite of penetration testing and security tools, making it a popular choice for security assessments and network testing.";
        }else if(messageText.equalsIgnoreCase("solus")){
            informationDistro="A modern Linux distribution designed for home computing. Solus features the Budgie desktop environment by default, though it also offers other desktop environments. It emphasizes ease of use, performance, and a curated software selection, with a focus on providing a cohesive and streamlined user experience.";
        }else{
            informationDistro="No distro found";
        }
        messageView.setText(informationDistro);
    }

    public void goBack(View view) {
        finish();
    }
}
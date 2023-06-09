package com.example.pr98;

import android.content.Context;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileProc {
        private int count;
        private final String FILENAME="data";
        public FileProc(int count){
            this.count=count;
        }

    public FileProc() {

    }

    public void writeFile(int count, Context context) {
            try {
                this.count = count;
                FileOutputStream fileOutputStream = context.openFileOutput(FILENAME, context.MODE_PRIVATE);
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
                bufferedWriter.write(count + "");
                bufferedWriter.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
            }
        }
            public void readFile(int count,FileInputStream fileInputStream){
                try{
                    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(fileInputStream));
                    String message="";
                    while((message=bufferedReader.readLine())!=null);
                    this.count=Integer.parseInt(message);
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }

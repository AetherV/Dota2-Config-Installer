package loopuleasa_Config;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.swing.*;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
/**
 * Write a description of class Install here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Install
{
    private String dir;
    private URL url;
    private File dTarget;
    private utils ut = new utils();
    public Install(String s, boolean loop, boolean tab, boolean core, String mantaPath)
    {
        dir=s+"\\game\\dota\\cfg";
        
        try{
            if(loop||tab||core){
            	System.out.println("Downloading");
            	url = new URL ("https://github.com/loopuleasa/Dota2-TheCore-Config-Engine/archive/master.zip");
            	dTarget=new File(dir+"\\temp\\extract.zip");
            	FileUtils.copyURLToFile(url, dTarget);
            }
        }catch (Exception e){System.out.println("Download Error: "+e);}
        
        try{
        	if(loop||tab||core){
        		System.out.println("Extracting");
        		ZipFile zipFile = new ZipFile(dTarget.toString());
        		zipFile.extractAll(dir+"\\temp");
        	}
            if(mantaPath.equals("")==false){
            	FileUtils.copyFile(new File(mantaPath), new File(dir+"\\temp\\Dota2-TheCore-Config-Engine-master\\Dota 2 Reborn Keyboard Setups\\manta.zip"));
            	ZipFile zipFile = new ZipFile(dir+"\\temp\\Dota2-TheCore-Config-Engine-master\\Dota 2 Reborn Keyboard Setups\\manta.zip");
            	zipFile.extractAll(dir+"\\temp\\Dota2-TheCore-Config-Engine-master\\Dota 2 Reborn Keyboard Setups\\manta");
            }
        }catch (ZipException e){System.out.println("Zip Extraction Error: "+e);}
        catch (IOException e){System.out.println("Move Manta Error: "+e);}
        
        try{
            String tDir=dir+"\\temp\\Dota2-TheCore-Config-Engine-master\\Dota 2 Reborn Keyboard Setups";
            if(loop){
                File dest=new File(dir+"\\loop");
                File origin = new File(tDir+"\\Loopuleasa's Super Compact QWERTG-DFXCV layout (ALT,SPACE mods)");
                FileUtils.copyDirectory (origin, dest);
                ut.cfgLaunch(1, dir);
            }
            if(tab){
                File dest=new File(dir+"\\tab");
                File origin = new File(tDir+"\\Tabby's small ISO Layout");
                FileUtils.copyDirectory (origin, dest);
                ut.cfgLaunch(2, dir);
            }
            if(core){
                File dest=new File(dir+"\\core");
                File origin = new File(tDir+"\\!! THE CORE - Customisable Config Engine (Alt & Space mods, quickcast toggle, custom hero modes) !!");
                FileUtils.copyDirectory (origin, dest);
                ut.cfgLaunch(3, dir);
            }
            if(!mantaPath.equals("")){
            	File dest=new File(dir+"\\manta");
                File origin = new File(tDir+"\\manta");
                FileUtils.copyDirectory (origin, dest);
                ut.cfgLaunch(4, dir);
            }
        }catch (Exception e){System.out.println("Move Error: "+e);}
        
        JOptionPane.showMessageDialog(new JFrame(),"Completed");
        
    }


}

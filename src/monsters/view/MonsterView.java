package monsters.view;

import javax.swing.JOptionPane;

import monsters.controller.MonsterAppController;

public class MonsterView
{
	private MonsterAppController baseController;
	
	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController;
	}
	
	public void displayInformation()
	{
		JOptionPane.showMessageDialog(null, "You have installed 50,000 viruses!");	
		JOptionPane.showMessageDialog(null, "I made a monster, its name is : " + baseController.getMyMonster().getName());
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getName() + " has " + baseController.getMyMonster().getArmCount() + " arms ");
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getName() + " has some " + baseController.getMyMonster().getNumberOfLegs() + " Legs ");
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getName() + " also has " + baseController.getMyMonster().getNoseCount() + " Noses ");
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getName() + " has " + baseController.getMyMonster().getAmountOfHair() + " Hair ");
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getName() + " also has " + baseController.getMyMonster().getEyeCount() + " Eyes ");
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getName() + " has an extremely " + baseController.getMyMonster().hasBellyButton() + " Belly Button ");





	}
}

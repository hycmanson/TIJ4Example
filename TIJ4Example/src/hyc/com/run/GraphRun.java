package hyc.com.run;

import java.util.Scanner;
import static net.mindview.util.Print.*;
public class GraphRun {
	public GraphRun() {
		print("***************************************************");
		print("* This is an example package of Thinking in Java! *");
		print("***************************************************");
		while (LoadMenu())
			;
	}

	private String readString(String prompt) {
		System.out.print(prompt);
		return new Scanner(System.in).nextLine();
	}

	private int readNumber(String prompt) {
		String paragraph = readString(prompt);
		try {
			return Integer.parseInt(paragraph);
		} catch (Exception e) {
			if (paragraph.equals("q")) {
				return -1;
			} else {
				print();
				print();
				print("*************************************");
				print("**          Wrong number!          **");
				print("*************************************");
				return 0;
			}
		}

	}

	private boolean LoadMenu() {
		print();
		print("********");
		print("* Menu *");
		print("********");
		print("01.Introduction to Objects");
		print("02.Everything Is an Object");
		print("03.Operators");
		print("04.Controlling Execution");
		print("05.Initialization & Cleanup");
		print("06.Access Control");
		print("07.Reusing Classes");
		print("08.Polymorphism");
		print("09.Interfaces");
		print("10.Inner Classes");
		print("11.Holding Your Objects");
		print("12.Error Handling with Exceptions");
		print("13.Strings");
		print("14.Type Information");
		print("15.Generics");
		print("16.Arrays");
		print("17.Containers in Depth");
		print("18.I/O");
		print("19.Enumerated Types");
		print("20.Annotations");
		print("21.Concurrency");
		print("22.Graphical User Interfaces");
		print("*************************************");
		int keyParagraph = readNumber("Please input the number of paragraph:");
		if (keyParagraph == -1) {
			return false;
		}
		print();
		print();
		print();
		print("*************************************");
		switch (keyParagraph) {
		case 1:
			LoadParagraph1();
			break;
		case 2:
			LoadParagraph2();
			break;
		case 3:
			LoadParagraph3();
			break;
		case 4:
			LoadParagraph4();
			break;
		case 5:
			LoadParagraph5();
			break;
		case 6:
			LoadParagraph6();
			break;
		case 7:
			LoadParagraph7();
			break;
		case 8:
			LoadParagraph8();
			break;
		case 9:
			LoadParagraph9();
			break;
		case 10:
			LoadParagraph10();
			break;
		case 11:
			LoadParagraph11();
			break;
		case 12:
			LoadParagraph12();
			break;
		case 13:
			LoadParagraph13();
			break;
		case 14:
			LoadParagraph14();
			break;
		case 15:
			LoadParagraph15();
			break;
		case 16:
			LoadParagraph16();
			break;
		case 17:
			LoadParagraph17();
			break;
		case 18:
			LoadParagraph18();
			break;
		case 19:
			LoadParagraph19();
			break;
		case 20:
			LoadParagraph20();
			break;
		case 21:
			LoadParagraph21();
			break;
		case 22:
			LoadParagraph22();
			break;
		default:
			print();
			print();
			print("*************************************");
			print("**         Wrong paragraph!        **");
			print("*************************************");
			return true;
		}
		print();
		print();
		print();
		print("*************************************");
		print("**    Do you want continue?(Y/N)   **");
		print("*************************************");
		String wantContinue = readString("");
		if (wantContinue.equals("y") || wantContinue.equals("Y")) {
			return true;
		}
		return false;
	}

	private void LoadParagraph1() {
		print("01.Introduction to Objects");
		print("*************************************");
	}

	private void LoadParagraph2() {
		print("02.Everything Is an Object");
		print("*************************************");
		print("01.HelloDate			P30");
		print("02.ShowProperties		P31");
		print("*************************************");
		print();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking._02_object.HelloDate.Test();
			break;
		case 2:
			new thinking._02_object.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph3() {
		print("03.Operators");
		print("*************************************");
		print("01.HelloDate			P38");
		print("02.Precedence			P39");
		print("03.Assignment			P40");
		print("04.PassObject			P40");
		print("05.MathOps			P41");
		print("06.AutoInc			P43");
		print("07.Equivalence			P44");
		print("08.EqualsMethod			P44");
		print("09.EqualsMethod2		P45");
		print("10.Bool				P45");
		print("11.ShortCircuit			P46");
		print("12.Literals			P47");
		print("13.Exponents			P48");
		print("14.URShift			P50");
		print("15.BitManipulation		P50");
		print("16.TernaryIfElse		P53");
		print("17.StringOperators		P53");
		print("18.Casting			P54");
		print("19.CastingNumbers		P55");
		print("20.RoundingNumbers		P55");
		print("21.AllOps			P56");
		print("22.Overflow			P63");
		print("*************************************");
		print();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking._03_operators.HelloDate.Test();
			break;
		case 2:
			new thinking._03_operators.Precedence.Test();
			break;
		case 3:
			new thinking._03_operators.Assignment.Test();
			break;
		case 4:
			new thinking._03_operators.PassObject.Test();
			break;
		case 5:
			new thinking._03_operators.MathOps.Test();
			break;
		case 6:
			new thinking._03_operators.AutoInc.Test();
			break;
		case 7:
			new thinking._03_operators.Equivalence.Test();
			break;
		case 8:
			new thinking._03_operators.EqualsMethod.Test();
			break;
		case 9:
			new thinking._03_operators.EqualsMethod2.Test();
			break;
		case 10:
			new thinking._03_operators.Bool.Test();
			break;
		case 11:
			new thinking._03_operators.ShortCircuit.Test();
			break;
		case 12:
			new thinking._03_operators.Literals.Test();
			break;
		case 13:
			new thinking._03_operators.Exponents.Test();
			break;
		case 14:
			new thinking._03_operators.URShift.Test();
			break;
		case 15:
			new thinking._03_operators.BitManipulation.Test();
			break;
		case 16:
			new thinking._03_operators.TernaryIfElse.Test();
			break;
		case 17:
			new thinking._03_operators.StringOperators.Test();
			break;
		case 18:
			new thinking._03_operators.Casting.Test();
			break;
		case 19:
			new thinking._03_operators.CastingNumbers.Test();
			break;
		case 20:
			new thinking._03_operators.RoundingNumbers.Test();
			break;
		case 21:
			new thinking._03_operators.AllOps.Test();
			break;
		case 22:
			new thinking._03_operators.Overflow.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph4() {
		print("04.Controlling Execution");
		print("*************************************");
		print("01.IfElse			P64");
		print("02.WhileTest			P65");
		print("03.ListCharacters		P66");
		print("04.CommaOperator		P67");
		print("05.ForEachFloat			P67");
		print("06.ForEachString		P68");
		print("07.IfElse2			P69");
		print("08.BreakAndContinue		P70");
		print("09.LabeledFor			P71");
		print("10.LabeledWhile			P72");
		print("11.VowelsAndConsonants		P74");
		print("*************************************");
		print();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking._04_control.IfElse.Test();
			break;
		case 2:
			new thinking._04_control.WhileTest.Test();
			break;
		case 3:
			new thinking._04_control.ListCharacters.Test();
			break;
		case 4:
			new thinking._04_control.CommaOperator.Test();
			break;
		case 5:
			new thinking._04_control.ForEachFloat.Test();
			break;
		case 6:
			new thinking._04_control.ForEachString.Test();
			break;
		case 7:
			new thinking._04_control.IfElse2.Test();
			break;
		case 8:
			new thinking._04_control.BreakAndContinue.Test();
			break;
		case 9:
			new thinking._04_control.LabeledFor.Test();
			break;
		case 10:
			new thinking._04_control.LabeledWhile.Test();
			break;
		case 11:
			new thinking._04_control.VowelsAndConsonants.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph5() {
		print("05.Initialization & Cleanup");
		print("*************************************");
		print("01.SimpleConstructor		P76");
		print("02.SimpleConstructor2		P77");
		print("03.Overloading			P78");
		print("04.OverloadingOrder		P79");
		print("05.PrimitiveOverloading		P79");
		print("06.Demotion			P81");
		print("07.DefaultConstructor		P83");
		print("08.NoStnthesis			P83");
		print("09.BananaPeel			P84");
		print("10.Apricot			P84");
		print("11.Leaf				P84");
		print("12.PassingThis			P85");
		print("13.Flower			P85");
		print("14.TerminationCondition		P89");
		print("15.InitialValues		P92");
		print("16.InitialValues2		P93");
		print("17.Measurement			P93");
		print("18.MethodInit			P93");
		print("19.OrderOfInitialization	P94");
		print("20.StaticInitialization		P95");
		print("21.ExplicitStatic		P97");
		print("22.Mugs				P98");
		print("23.ArraysOfPrimitives		P99");
		print("24.ArrayNew			P100");
		print("25.ArrayClassObj		P100");
		print("26.ArrayInit			P101");
		print("27.DynamicArray			P101");
		print("28.VarArgs			P102");
		print("29.NewVarArgs			P102");
		print("30.OptionalTrailingArguments	P103");
		print("31.VarargType			P103");
		print("32.AutoboxingVarargs		P104");
		print("33.OverloadingVarargs		P104");
		print("34.OverloadingVarargs2		P105");
		print("35.OverloadingVarargs3		P105");
		print("36.SimpleEnumUse		P106");
		print("37.EnumOrder			P106");
		print("38.Burrito			P106");
		print("*************************************");
		print();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking._05_initialization.SimpleConstructor.Test();
			break;
		case 2:
			new thinking._05_initialization.SimpleConstructor2.Test();
			break;
		case 3:
			new thinking._05_initialization.Overloading.Test();
			break;
		case 4:
			new thinking._05_initialization.OverloadingOrder.Test();
			break;
		case 5:
			new thinking._05_initialization.PrimitiveOverloading.Test();
			break;
		case 6:
			new thinking._05_initialization.Demotion.Test();
			break;
		case 7:
			new thinking._05_initialization.DefaultConstructor.Test();
			break;
		case 8:
			new thinking._05_initialization.NoStnthesis.Test();
			break;
		case 9:
			new thinking._05_initialization.BananaPeel.Test();
			break;
		case 10:
			new thinking._05_initialization.Apricot.Test();
			break;
		case 11:
			new thinking._05_initialization.Leaf.Test();
			break;
		case 12:
			new thinking._05_initialization.PassingThis.Test();
			break;
		case 13:
			new thinking._05_initialization.Flower.Test();
			break;
		case 14:
			new thinking._05_initialization.TerminationCondition.Test();
			break;
		case 15:
			new thinking._05_initialization.InitialValues.Test();
			break;
		case 16:
			new thinking._05_initialization.InitialValues2.Test();
			break;
		case 17:
			new thinking._05_initialization.Measurement.Test();
			break;
		case 18:
			new thinking._05_initialization.MethodInit.Test();
			break;
		case 19:
			new thinking._05_initialization.OrderOfInitialization.Test();
			break;
		case 20:
			new thinking._05_initialization.StaticInitialization.Test();
			break;
		case 21:
			new thinking._05_initialization.ExplicitStatic.Test();
			break;
		case 22:
			new thinking._05_initialization.Mugs.Test();
			break;
		case 23:
			new thinking._05_initialization.ArraysOfPrimitives.Test();
			break;
		case 24:
			new thinking._05_initialization.ArrayNew.Test();
			break;
		case 25:
			new thinking._05_initialization.ArrayClassObj.Test();
			break;
		case 26:
			new thinking._05_initialization.ArrayInit.Test();
			break;
		case 27:
			new thinking._05_initialization.DynamicArray.Test();
			break;
		case 28:
			new thinking._05_initialization.VarArgs.Test();
			break;
		case 29:
			new thinking._05_initialization.NewVarArgs.Test();
			break;
		case 30:
			new thinking._05_initialization.OptionalTrailingArguments.Test();
			break;
		case 31:
			new thinking._05_initialization.VarargType.Test();
			break;
		case 32:
			new thinking._05_initialization.AutoboxingVarargs.Test();
			break;
		case 33:
			new thinking._05_initialization.OverloadingVarargs.Test();
			break;
		case 34:
			new thinking._05_initialization.OverloadingVarargs2.Test();
			break;
		case 35:
			new thinking._05_initialization.OverloadingVarargs3.Test();
			break;
		case 36:
			new thinking._05_initialization.SimpleEnumUse.Test();
			break;
		case 37:
			new thinking._05_initialization.EnumOrder.Test();
			break;
		case 38:
			new thinking._05_initialization.Burrito.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph6() {
		print("06.Access Control");
		print("*************************************");
		print("01.FullQualification		P110");
		print("02.SingleImport			P110");
		print("03.MyClass			P111");
		print("04.ImportMyClass		P111");
		print("05.LibTest			P113");
		print("06.PrintTest			P114");
		print("07.Cookie			P117");
		print("08.Dinner			P117");
		print("09.Cake				P117");
		print("10.IceCream			P118");
		print("11.ChocolateChip		P119");
		print("12.CookieProtected		P119");
		print("13.ChocolateChipProtected	P119");
		print("14.OrganizedByAccess		P120");
		print("15.Lunch			P122");
		print("*************************************");
		print();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking._06_access.FullQualification.Test();
			break;
		case 2:
			new thinking._06_access.SingleImport.Test();
			break;
		case 3:
			new thinking._06_access.MyClass.Test();
			break;
		case 4:
			new thinking._06_access.ImportMyClass.Test();
			break;
		case 5:
			new thinking._06_access.LibTest.Test();
			break;
		case 6:
			new thinking._06_access.PrintTest.Test();
			break;
		case 7:
			new thinking._06_access.Cookie.Test();
			break;
		case 8:
			new thinking._06_access.Dinner.Test();
			break;
		case 9:
			new thinking._06_access.Cake.Test();
			break;
		case 10:
			new thinking._06_access.IceCream.Test();
			break;
		case 11:
			new thinking._06_access.ChocolateChip.Test();
			break;
		case 12:
			new thinking._06_access.CookieProtected.Test();
			break;
		case 13:
			new thinking._06_access.ChocolateChipProtected.Test();
			break;
		case 14:
			new thinking._06_access.OrganizedByAccess.Test();
			break;
		case 15:
			new thinking._06_access.Lunch.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph7() {
		print("07.Reusing Classes");
		print("*************************************");
		print("01.SprinklerSystem		P125");
		print("02.Bath				P126");
		print("03.Detergent			P127");
		print("04.Cartoon			P129");
		print("05.Chess			P130");
		print("06.SpaceShipControls		P131");
		print("07.SpaceShipDelegation		P131");
		print("08.PlaceSetting			P132");
		print("09.CADSystem			P134");
		print("10.Hide				P136");
		print("11.Car				P137");
		print("12.Orc				P138");
		print("13.Wind				P139");
		print("14.FinalData			P140");
		print("15.BlankFinal			P142");
		print("16.FinalArguments		P142");
		print("17.FinalOverridingIllusion	P143");
		print("18.Beetle			P146");
		print("*************************************");
		print();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking._07_reusing.SprinklerSystem.Test();
			break;
		case 2:
			new thinking._07_reusing.Bath.Test();
			break;
		case 3:
			new thinking._07_reusing.Detergent.Test();
			break;
		case 4:
			new thinking._07_reusing.Cartoon.Test();
			break;
		case 5:
			new thinking._07_reusing.Chess.Test();
			break;
		case 6:
			new thinking._07_reusing.SpaceShipControls.Test();
			break;
		case 7:
			new thinking._07_reusing.SpaceShipDelegation.Test();
			break;
		case 8:
			new thinking._07_reusing.PlaceSetting.Test();
			break;
		case 9:
			new thinking._07_reusing.CADSystem.Test();
			break;
		case 10:
			new thinking._07_reusing.Hide.Test();
			break;
		case 11:
			new thinking._07_reusing.Car.Test();
			break;
		case 12:
			new thinking._07_reusing.Orc.Test();
			break;
		case 13:
			new thinking._07_reusing.Wind.Test();
			break;
		case 14:
			new thinking._07_reusing.FinalData.Test();
			break;
		case 15:
			new thinking._07_reusing.BlankFinal.Test();
			break;
		case 16:
			new thinking._07_reusing.FinalArguments.Test();
			break;
		case 17:
			new thinking._07_reusing.FinalOverridingIllusion.Test();
			break;
		case 18:
			new thinking._07_reusing.Beetle.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph8() {
		print("08.Polymorphism");
		print("*************************************");
		print("01.Music			P148");
		print("02.Music2			P149");
		print("03.Shape			P152");
		print("04.Music3			P154");
		print("05.PrivateOverride		P156");
		print("06.FieldAccess			P156");
		print("07.StaticPolymorphism		P157");
		print("08.Sandwich			P158");
		print("09.Frog				P159");
		print("10.ReferenceCounting		P161");
		print("11.PolyConstructors		P163");
		print("12.CovariantReturn		P164");
		print("13.Transmogrify			P165");
		print("14.RTTI				P167");
		print("*************************************");
		print();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking._08_polymorphism.Music.Test();
			break;
		case 2:
			new thinking._08_polymorphism.Music2.Test();
			break;
		case 3:
			new thinking._08_polymorphism.Shape.Test();
			break;
		case 4:
			new thinking._08_polymorphism.Music3.Test();
			break;
		case 5:
			new thinking._08_polymorphism.PrivateOverride.Test();
			break;
		case 6:
			new thinking._08_polymorphism.FieldAccess.Test();
			break;
		case 7:
			new thinking._08_polymorphism.StaticPolymorphism.Test();
			break;
		case 8:
			new thinking._08_polymorphism.Sandwich.Test();
			break;
		case 9:
			new thinking._08_polymorphism.Frog.Test();
			break;
		case 10:
			new thinking._08_polymorphism.ReferenceCounting.Test();
			break;
		case 11:
			new thinking._08_polymorphism.PolyConstructors.Test();
			break;
		case 12:
			new thinking._08_polymorphism.CovariantReturn.Test();
			break;
		case 13:
			new thinking._08_polymorphism.Transmogrify.Test();
			break;
		case 14:
			new thinking._08_polymorphism.RTTI.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph9() {
		print("09.Interfaces");
		print("*************************************");
		print("01.Music4			P170");
		print("02.Music5			P173");
		print("03.Apply			P174");
		print("04.Filters			P175");
		print("05.InterfaceProcessor		P176");
		print("06.FilterProcessor		P177");
		print("07.Adventure			P179");
		print("08.HorrorShow			P180");
		print("09.InterfaceCollision		P181");
		print("10.RandomWords			P182");
		print("11.RandomDoubles		P183");
		print("12.AdaptedRandomDoubles		P183");
		print("13.RandVals			P184");
		print("14.NestingInterfaces		P185");
		print("15.Factories			P187");
		print("16.Games			P187");
		print("*************************************");
		print();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking._09_interfaces.Music4.Test();
			break;
		case 2:
			new thinking._09_interfaces.Music5.Test();
			break;
		case 3:
			new thinking._09_interfaces.Apply.Test();
			break;
		case 4:
			new thinking._09_interfaces.Filters.Test();
			break;
		case 5:
			new thinking._09_interfaces.InterfaceProcessor.Test();
			break;
		case 6:
			new thinking._09_interfaces.FilterProcessor.Test();
			break;
		case 7:
			new thinking._09_interfaces.Adventure.Test();
			break;
		case 8:
			new thinking._09_interfaces.HorrorShow.Test();
			break;
		case 9:
			new thinking._09_interfaces.InterfaceCollision.Test();
			break;
		case 10:
			new thinking._09_interfaces.RandomWords.Test();
			break;
		case 11:
			new thinking._09_interfaces.RandomDoubles.Test();
			break;
		case 12:
			new thinking._09_interfaces.AdaptedRandomDoubles.Test();
			break;
		case 13:
			new thinking._09_interfaces.RandVals.Test();
			break;
		case 14:
			new thinking._09_interfaces.NestingInterfaces.Test();
			break;
		case 15:
			new thinking._09_interfaces.Factories.Test();
			break;
		case 16:
			new thinking._09_interfaces.Games.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph10() {
		print("10.Inner Classes");
		print("*************************************");
		print("01.Parcel1			P190");
		print("02.Parcel2			P191");
		print("03.Sequence			P191");
		print("04.DotThis			P193");
		print("05.DotNew			P193");
		print("06.Parcel3			P193");
		print("07.TestParcel			P194");
		print("08.Parcel5			P195");
		print("09.Parcel6			P196");
		print("10.Parcel7			P197");
		print("11.Parcel7b			P197");
		print("12.Parcel8			P197");
		print("13.Parcel9			P198");
		print("14.AnonymousConstructor		P198");
		print("15.Parcel10			P199");
		print("16.Factories			P199");
		print("17.Games			P200");
		print("18.Parcel11			P201");
		print("19.ClassInInterface		P202");
		print("20.TestBed			P203");
		print("21.MultiNestingAccess		P203");
		print("22.MultiInterfaces		P204");
		print("23.MultiImplementation		P205");
		print("24.Callbacks			P206");
		print("25.Controller			P208");
		print("26.GreenhouseControls		P209");
		print("27.InheritInner			P212");
		print("28.BigEgg			P212");
		print("29.BigEgg2			P213");
		print("30.LocalInnerClass		P214");
		print("*************************************");
		print();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking._10_innerclasses.Parcel1.Test();
			break;
		case 2:
			new thinking._10_innerclasses.Parcel2.Test();
			break;
		case 3:
			new thinking._10_innerclasses.Sequence.Test();
			break;
		case 4:
			new thinking._10_innerclasses.DotThis.Test();
			break;
		case 5:
			new thinking._10_innerclasses.DotNew.Test();
			break;
		case 6:
			new thinking._10_innerclasses.Parcel3.Test();
			break;
		case 7:
			new thinking._10_innerclasses.TestParcel.Test();
			break;
		case 8:
			new thinking._10_innerclasses.Parcel5.Test();
			break;
		case 9:
			new thinking._10_innerclasses.Parcel6.Test();
			break;
		case 10:
			new thinking._10_innerclasses.Parcel7.Test();
			break;
		case 11:
			new thinking._10_innerclasses.Parcel7b.Test();
			break;
		case 12:
			new thinking._10_innerclasses.Parcel8.Test();
			break;
		case 13:
			new thinking._10_innerclasses.Parcel9.Test();
			break;
		case 14:
			new thinking._10_innerclasses.AnonymousConstructor.Test();
			break;
		case 15:
			new thinking._10_innerclasses.Parcel10.Test();
			break;
		case 16:
			new thinking._10_innerclasses.Factories.Test();
			break;
		case 17:
			new thinking._10_innerclasses.Games.Test();
			break;
		case 18:
			new thinking._10_innerclasses.Parcel11.Test();
			break;
		case 19:
			new thinking._10_innerclasses.ClassInInterface.Test();
			break;
		case 20:
			new thinking._10_innerclasses.TestBed.Test();
			break;
		case 21:
			new thinking._10_innerclasses.MultiNestingAccess.Test();
			break;
		case 22:
			new thinking._10_innerclasses.MultiInterfaces.Test();
			break;
		case 23:
			new thinking._10_innerclasses.MultiImplementation.Test();
			break;
		case 24:
			new thinking._10_innerclasses.Callbacks.Test();
			break;
		case 25:
			new thinking._10_innerclasses.Controller.Test();
			break;
		case 26:
			new thinking._10_innerclasses.GreenhouseControls.Test();
			break;
		case 27:
			new thinking._10_innerclasses.InheritInner.Test();
			break;
		case 28:
			new thinking._10_innerclasses.BigEgg.Test();
			break;
		case 29:
			new thinking._10_innerclasses.BigEgg2.Test();
			break;
		case 30:
			new thinking._10_innerclasses.LocalInnerClass.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph11() {
		print("11.Holding Your Objects");
		print("*************************************");
		print("01.HelloDate			P30");
		print("02.ShowProperties		P31");
		print("*************************************");
		print();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking._02_object.HelloDate.Test();
			break;
		case 2:
			new thinking._02_object.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph12() {
		print("12.Error Handling with Exceptions");
		print("*************************************");
		print("01.HelloDate			P30");
		print("02.ShowProperties		P31");
		print("*************************************");
		print();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking._02_object.HelloDate.Test();
			break;
		case 2:
			new thinking._02_object.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph13() {
		print("13.Strings");
		print("*************************************");
		print("01.HelloDate			P30");
		print("02.ShowProperties		P31");
		print("*************************************");
		print();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking._02_object.HelloDate.Test();
			break;
		case 2:
			new thinking._02_object.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph14() {
		print("14.Type Information");
		print("*************************************");
		print("01.HelloDate			P30");
		print("02.ShowProperties		P31");
		print("*************************************");
		print();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking._02_object.HelloDate.Test();
			break;
		case 2:
			new thinking._02_object.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph15() {
		print("15.Generics");
		print("*************************************");
		print("01.HelloDate			P30");
		print("02.ShowProperties		P31");
		print("*************************************");
		print();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking._02_object.HelloDate.Test();
			break;
		case 2:
			new thinking._02_object.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph16() {
		print("16.Arrays");
		print("*************************************");
		print("01.HelloDate			P30");
		print("02.ShowProperties		P31");
		print("*************************************");
		print();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking._02_object.HelloDate.Test();
			break;
		case 2:
			new thinking._02_object.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph17() {
		print("17.Containers in Depth");
		print("*************************************");
		print("01.HelloDate			P30");
		print("02.ShowProperties		P31");
		print("*************************************");
		print();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking._02_object.HelloDate.Test();
			break;
		case 2:
			new thinking._02_object.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph18() {
		print("18.I/O");
		print("*************************************");
		print("01.HelloDate			P30");
		print("02.ShowProperties		P31");
		print("*************************************");
		print();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking._02_object.HelloDate.Test();
			break;
		case 2:
			new thinking._02_object.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph19() {
		print("19.Enumerated Types");
		print("*************************************");
		print("01.HelloDate			P30");
		print("02.ShowProperties		P31");
		print("*************************************");
		print();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking._02_object.HelloDate.Test();
			break;
		case 2:
			new thinking._02_object.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph20() {
		print("20.Annotations");
		print("*************************************");
		print("01.HelloDate			P30");
		print("02.ShowProperties		P31");
		print("*************************************");
		print();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking._02_object.HelloDate.Test();
			break;
		case 2:
			new thinking._02_object.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph21() {
		print("21.Concurrency");
		print("*************************************");
		print("01.HelloDate			P30");
		print("02.ShowProperties		P31");
		print("*************************************");
		print();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking._02_object.HelloDate.Test();
			break;
		case 2:
			new thinking._02_object.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph22() {
		print("22.Graphical User Interfaces");
		print("*************************************");
		print("01.HelloDate			P30");
		print("02.ShowProperties		P31");
		print("*************************************");
		print();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking._02_object.HelloDate.Test();
			break;
		case 2:
			new thinking._02_object.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraphStart() {
		print();
		print();
		print();
		print("-------------------------------------");
		print("-------------------------------------");
	}

	private void LoadProgramEnd() {
		print("-------------------------------------");
		print("-------------------------------------");
	}

	private void LoadProgramWrong() {
		print();
		print();
		print("*************************************");
		print("**          Wrong number!          **");
		print("*************************************");
	}
}

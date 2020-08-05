package xyz.example.demo.contract;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.5.5.
 */
@SuppressWarnings("rawtypes")
public class TaskContract extends Contract {
    private static final String BINARY = "608060405260006004553480156200001657600080fd5b506040516200354b3803806200354b833981810160405260208110156200003c57600080fd5b5051600080546001600160a01b0319166001600160a01b03808416919091179182905560408051635119143b60e11b81529051929091169163a232287691600480820192602092909190829003018186803b1580156200009b57600080fd5b505afa158015620000b0573d6000803e3d6000fd5b505050506040513d6020811015620000c757600080fd5b50516001600160a01b0316331462000118576040805162461bcd60e51b815260206004820152600f60248201526e36bab9ba1031329036b0b730b3b2b960891b604482015290519081900360640190fd5b50600180546001600160a01b03191633179055600060025561340b80620001406000396000f3fe6080604052600436106100915760003560e01c80638923d549116100595780638923d549146106da5780638e1662bc14610802578063afabc5831461081f578063bf24852a14610855578063daf07b1f146109d157610091565b806327f88bc41461009657806344740457146101e45780635591bda1146102ab5780637417469c1461046a5780637cda779d14610510575b600080fd5b3480156100a257600080fd5b506100c0600480360360208110156100b957600080fd5b5035610a0d565b60405180806020018b81526020018a81526020018981526020018881526020018781526020018681526020018581526020018460048111156100fe57fe5b60ff1681526020018060200183810383528d818151815260200191508051906020019080838360005b8381101561013f578181015183820152602001610127565b50505050905090810190601f16801561016c5780820380516001836020036101000a031916815260200191505b50838103825284518152845160209182019186019080838360005b8381101561019f578181015183820152602001610187565b50505050905090810190601f1680156101cc5780820380516001836020036101000a031916815260200191505b509c5050505050505050505050505060405180910390f35b3480156101f057600080fd5b506102976004803603604081101561020757600080fd5b810190602081018135600160201b81111561022157600080fd5b82018360208201111561023357600080fd5b803590602001918460018302840111600160201b8311171561025457600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295505091359250610d6a915050565b604080519115158252519081900360200190f35b3480156102b757600080fd5b50610468600480360360808110156102ce57600080fd5b810190602081018135600160201b8111156102e857600080fd5b8201836020820111156102fa57600080fd5b803590602001918460018302840111600160201b8311171561031b57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050600160201b81111561036d57600080fd5b82018360208201111561037f57600080fd5b803590602001918460018302840111600160201b831117156103a057600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050600160201b8111156103f257600080fd5b82018360208201111561040457600080fd5b803590602001918460018302840111600160201b8311171561042557600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295505091359250610f26915050565b005b6104686004803603604081101561048057600080fd5b810190602081018135600160201b81111561049a57600080fd5b8201836020820111156104ac57600080fd5b803590602001918460018302840111600160201b831117156104cd57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295505091359250611304915050565b610468600480360361010081101561052757600080fd5b810190602081018135600160201b81111561054157600080fd5b82018360208201111561055357600080fd5b803590602001918460018302840111600160201b8311171561057457600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050600160201b8111156105c657600080fd5b8201836020820111156105d857600080fd5b803590602001918460018302840111600160201b831117156105f957600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929584359560208601359560408101359550606081013594506080810135935060c081019060a00135600160201b81111561066657600080fd5b82018360208201111561067857600080fd5b803590602001918460018302840111600160201b8311171561069957600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929550611662945050505050565b3480156106e657600080fd5b5061078d600480360360408110156106fd57600080fd5b810190602081018135600160201b81111561071757600080fd5b82018360208201111561072957600080fd5b803590602001918460018302840111600160201b8311171561074a57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295505091359250611a6d915050565b6040805160208082528351818301528351919283929083019185019080838360005b838110156107c75781810151838201526020016107af565b50505050905090810190601f1680156107f45780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6104686004803603602081101561081857600080fd5b5035612288565b34801561082b57600080fd5b506104686004803603606081101561084257600080fd5b50803590602081013590604001356125fa565b34801561086157600080fd5b5061087f6004803603602081101561087857600080fd5b5035612e77565b60405180806020018060200180602001868152602001858152602001848103845289818151815260200191508051906020019080838360005b838110156108d05781810151838201526020016108b8565b50505050905090810190601f1680156108fd5780820380516001836020036101000a031916815260200191505b5084810383528851815288516020918201918a019080838360005b83811015610930578181015183820152602001610918565b50505050905090810190601f16801561095d5780820380516001836020036101000a031916815260200191505b50848103825287518152875160209182019189019080838360005b83811015610990578181015183820152602001610978565b50505050905090810190601f1680156109bd5780820380516001836020036101000a031916815260200191505b509850505050505050505060405180910390f35b3480156109dd57600080fd5b506109fb600480360360208110156109f457600080fd5b50356130bb565b60408051918252519081900360200190f35b60606000806000806000806000806060610a268b6130d0565b50610a2f6131d4565b600360008d81526020019081526020016000206040518061020001604052908160008201548152602001600182018054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610af15780601f10610ac657610100808354040283529160200191610af1565b820191906000526020600020905b815481529060010190602001808311610ad457829003601f168201915b50505091835250506002828101546001600160a01b031660208084019190915260038401805460408051601f60001960018516156101000201909316959095049182018490048402850184018152818552909401939091830182828015610b995780601f10610b6e57610100808354040283529160200191610b99565b820191906000526020600020905b815481529060010190602001808311610b7c57829003601f168201915b50505091835250506004828101546020830152600583015460408301526006830154606083015260078301546080830152600883015460a0830152600983015460c0830152600a83015460e0830152600b8301546101009092019160ff1690811115610c0157fe5b6004811115610c0c57fe5b8152600c8201805460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152938201939291830182828015610c9a5780601f10610c6f57610100808354040283529160200191610c9a565b820191906000526020600020905b815481529060010190602001808311610c7d57829003601f168201915b50505050508152602001600d8201548152602001600e8201548152602001600f8201805480602002602001604051908101604052809291908181526020018280548015610d0657602002820191906000526020600020905b815481526020019060010190808311610cf2575b5050505050815250509050806060015181608001518260a001518360c001518460e001518561010001518661012001518761014001518861016001518961018001519a509a509a509a509a509a509a509a509a509a50509193959799509193959799565b6000805460405163d536fc4760e01b81526020600482018181528651602484015286516060946001600160a01b03169363d536fc47938993928392604401918501908083838c5b83811015610dc9578181015183820152602001610db1565b50505050905090810190601f168015610df65780820380516001836020036101000a031916815260200191505b509250505060006040518083038186803b158015610e1357600080fd5b505afa158015610e27573d6000803e3d6000fd5b505050506040513d6000823e601f3d908101601f191682016040526020811015610e5057600080fd5b8101908080516040519392919084600160201b821115610e6f57600080fd5b908301906020820185811115610e8457600080fd5b82518660208202830111600160201b82111715610ea057600080fd5b82525081516020918201928201910280838360005b83811015610ecd578181015183820152602001610eb5565b50505050905001604052505050905060008090505b8151811015610f1957818181518110610ef757fe5b6020026020010151841415610f1157600192505050610f20565b600101610ee2565b5060009150505b92915050565b6000818152600360205260409020610f3e8583610d6a565b1515600114610f94576040805162461bcd60e51b815260206004820152601d60248201527f796f7520686173206e6f7420416363657074656420746865207461736b000000604482015290519081900360640190fd5b600080546040516399331f5360e01b81526020600482018181528951602484015289516001600160a01b03909416946399331f53948b94929384936044019290860191908190849084905b83811015610ff7578181015183820152602001610fdf565b50505050905090810190601f1680156110245780820380516001836020036101000a031916815260200191505b509250505060206040518083038186803b15801561104157600080fd5b505afa158015611055573d6000803e3d6000fd5b505050506040513d602081101561106b57600080fd5b50516001600160a01b031633146110c9576040805162461bcd60e51b815260206004820152601960248201527f6d73672e73656e64657220213d206d616e616765724164647200000000000000604482015290519081900360640190fd5b8060060154421115611114576040805162461bcd60e51b815260206004820152600f60248201526e4f7574206f6620646561646c696e6560881b604482015290519081900360640190fd5b600d81018054600190810190915560048054909101808255604080516101008101825282815260208082018790526000805484516399331f5360e01b81529687018381528c5160248901528c5196979496958701956001600160a01b03909216946399331f53948e9492938493604490930192918601918190849084905b838110156111aa578181015183820152602001611192565b50505050905090810190601f1680156111d75780820380516001836020036101000a031916815260200191505b509250505060206040518083038186803b1580156111f457600080fd5b505afa158015611208573d6000803e3d6000fd5b505050506040513d602081101561121e57600080fd5b50516001600160a01b03908116825260208083018a905260408084018a905260608085018a9052426080860152600060a0909501859052868552600583529381902085518155858301516001820155908501516002820180546001600160a01b031916919094161790925591830151805191926112a392600385019290910190613265565b50608082015180516112bf916004840191602090910190613265565b5060a082015180516112db916005840191602090910190613265565b5060c0820151600682015560e0909101516007909101556112fb836130d0565b50505050505050565b6000818152600360205260409020606061131e8484611a6d565b60408051808201909152600e81526d31b7b733b630ba3ab630ba34b7b760911b60209182015281519082012090915081907fac8bb02262cd42eff3f690eb81d16eba209a96898c0ffd65a582cc83f8158bcc146113f95760405162461bcd60e51b81526004018080602001828103825283818151815260200191508051906020019080838360005b838110156113be5781810151838201526020016113a6565b50505050905090810190601f1680156113eb5780820380516001836020036101000a031916815260200191505b509250505060405180910390fd5b50600080546040805163846c68d360e01b81523360248201819052600482019283528851604483015288516001600160a01b039094169463846c68d3948a949293839260649091019160208701918190849084905b8381101561146657818101518382015260200161144e565b50505050905090810190601f1680156114935780820380516001836020036101000a031916815260200191505b50935050505060206040518083038186803b1580156114b157600080fd5b505afa1580156114c5573d6000803e3d6000fd5b505050506040513d60208110156114db57600080fd5b50511515600114611533576040805162461bcd60e51b815260206004820181905260248201527f41646472206d75737420657175616c207769746820776f726b65724e616d6521604482015290519081900360640190fd5b816005015434116115755760405162461bcd60e51b81526004018080602001828103825260278152602001806133896027913960400191505060405180910390fd5b6000805460408051637861169d60e11b815260248101879052600481019182528751604482015287516001600160a01b039093169363f0c22d3a93899389939092839260649092019160208701918190849084905b838110156115e25781810151838201526020016115ca565b50505050905090810190601f16801561160f5780820380516001836020036101000a031916815260200191505b509350505050600060405180830381600087803b15801561162f57600080fd5b505af1158015611643573d6000803e3d6000fd5b50505060088301805460010190555061165b836130d0565b5050505050565b600080546040805163846c68d360e01b81523360248201819052600482019283528c5160448301528c5190946001600160a01b039094169363846c68d3938e9387939192839260649092019160208701918190849084905b838110156116d25781810151838201526020016116ba565b50505050905090810190601f1680156116ff5780820380516001836020036101000a031916815260200191505b50935050505060206040518083038186803b15801561171d57600080fd5b505afa158015611731573d6000803e3d6000fd5b505050506040513d602081101561174757600080fd5b505115156001146117895760405162461bcd60e51b81526004018080602001828103825260268152602001806133b06026913960400191505060405180910390fd5b6000349050606060405180610200016040528060025481526020018c8152602001846001600160a01b031681526020018b81526020018381526020018a815260200189815260200188815260200160008152602001878152602001868152602001600060048111156117f757fe5b81526020808201879052600060408084018290526060840182905260809093018590526002548152600382529190912082518155828201518051919261184592600185019290910190613265565b5060408201516002820180546001600160a01b0319166001600160a01b0390921691909117905560608201518051611887916003840191602090910190613265565b506080820151816004015560a0820151816005015560c0820151816006015560e082015181600701556101008201518160080155610120820151816009015561014082015181600a015561016082015181600b0160006101000a81548160ff021916908360048111156118f657fe5b0217905550610180820151805161191791600c840191602090910190613265565b506101a0820151600d8201556101c0820151600e8201556101e0820151805161194a91600f8401916020909101906132e3565b5050600080546002805480845260036020526040938490208451630179745360e11b815260248101839052600481019586526001918201805460001993811615610100029390930190921693909304604484018190526001600160a01b0390941695506302f2e8a69490939192909182916064019085908015611a0e5780601f106119e357610100808354040283529160200191611a0e565b820191906000526020600020905b8154815290600101906020018083116119f157829003601f168201915b50509350505050600060405180830381600087803b158015611a2f57600080fd5b505af1158015611a43573d6000803e3d6000fd5b50506002549150611a559050816130d0565b50506002805460010190555050505050505050505050565b6060611a78826130d0565b50611a816131d4565b600360008481526020019081526020016000206040518061020001604052908160008201548152602001600182018054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015611b435780601f10611b1857610100808354040283529160200191611b43565b820191906000526020600020905b815481529060010190602001808311611b2657829003601f168201915b50505091835250506002828101546001600160a01b031660208084019190915260038401805460408051601f60001960018516156101000201909316959095049182018490048402850184018152818552909401939091830182828015611beb5780601f10611bc057610100808354040283529160200191611beb565b820191906000526020600020905b815481529060010190602001808311611bce57829003601f168201915b50505091835250506004828101546020830152600583015460408301526006830154606083015260078301546080830152600883015460a0830152600983015460c0830152600a83015460e0830152600b8301546101009092019160ff1690811115611c5357fe5b6004811115611c5e57fe5b8152600c8201805460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152938201939291830182828015611cec5780601f10611cc157610100808354040283529160200191611cec565b820191906000526020600020905b815481529060010190602001808311611ccf57829003601f168201915b50505050508152602001600d8201548152602001600e8201548152602001600f8201805480602002602001604051908101604052809291908181526020018280548015611d5857602002820191906000526020600020905b815481526020019060010190808311611d44575b5050505050815250509050836040516020018082805190602001908083835b60208310611d965780518252601f199092019160209182019101611d77565b6001836020036101000a0380198251168184511680821785525050505050509050019150506040516020818303038152906040528051906020012081602001516040516020018082805190602001908083835b60208310611e085780518252601f199092019160209182019101611de9565b6001836020036101000a038019825116818451168082178552505050505050905001915050604051602081830303815290604052805190602001201415611e7157505060408051808201909152600a8152693737ba103837b9ba32b960b11b6020820152610f20565b8060c001514210611eb757505060408051808201909152601781527f646561646c696e65206973206f7574206f6620646174650000000000000000006020820152610f20565b60018161016001516004811115611eca57fe5b14611f0a57505060408051808201909152601981527f537461747573206d75737420626520556e6163636570746564000000000000006020820152610f20565b60a081015133311015611f55576040518060400160405280602081526020017f62616c616e6365206d757374206c6172676572207468616e206465706f736974815250915050610f20565b61012081015160008054604051632444ea7160e21b81526020600482018181528951602484015289516001600160a01b0390941694639113a9c4948b94929384936044019290860191908190849084905b83811015611fbe578181015183820152602001611fa6565b50505050905090810190601f168015611feb5780820380516001836020036101000a031916815260200191505b509250505060206040518083038186803b15801561200857600080fd5b505afa15801561201c573d6000803e3d6000fd5b505050506040513d602081101561203257600080fd5b5051101561207557505060408051808201909152601881527f72657075746174696f6e206973206e6f7420656e6f75676800000000000000006020820152610f20565b6000805460405163d536fc4760e01b81526020600482018181528851602484015288516060956001600160a01b039095169463d536fc47948b94849360449092019290860191908190849084905b838110156120db5781810151838201526020016120c3565b50505050905090810190601f1680156121085780820380516001836020036101000a031916815260200191505b509250505060006040518083038186803b15801561212557600080fd5b505afa158015612139573d6000803e3d6000fd5b505050506040513d6000823e601f3d908101601f19168201604052602081101561216257600080fd5b8101908080516040519392919084600160201b82111561218157600080fd5b90830190602082018581111561219657600080fd5b82518660208202830111600160201b821117156121b257600080fd5b82525081516020918201928201910280838360005b838110156121df5781810151838201526020016121c7565b50505050905001604052505050905060008090505b81518110156122595781818151811061220957fe5b602002602001015185141561225157604051806040016040528060168152602001751e5bdd481a185d99481899595b881058d8d95c1d195960521b8152509350505050610f20565b6001016121f4565b505060408051808201909152600e81526d31b7b733b630ba3ab630ba34b7b760911b6020820152949350505050565b6122906131d4565b600360008381526020019081526020016000206040518061020001604052908160008201548152602001600182018054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156123525780601f1061232757610100808354040283529160200191612352565b820191906000526020600020905b81548152906001019060200180831161233557829003601f168201915b50505091835250506002828101546001600160a01b031660208084019190915260038401805460408051601f600019600185161561010002019093169590950491820184900484028501840181528185529094019390918301828280156123fa5780601f106123cf576101008083540402835291602001916123fa565b820191906000526020600020905b8154815290600101906020018083116123dd57829003601f168201915b50505091835250506004828101546020830152600583015460408301526006830154606083015260078301546080830152600883015460a0830152600983015460c0830152600a83015460e0830152600b8301546101009092019160ff169081111561246257fe5b600481111561246d57fe5b8152600c8201805460408051602060026001851615610100026000190190941693909304601f81018490048402820184019092528181529382019392918301828280156124fb5780601f106124d0576101008083540402835291602001916124fb565b820191906000526020600020905b8154815290600101906020018083116124de57829003601f168201915b50505050508152602001600d8201548152602001600e8201548152602001600f820180548060200260200160405190810160405280929190818152602001828054801561256757602002820191906000526020600020905b815481526020019060010190808311612553575b505050505081525050905061257b826130d0565b506004816101600151600481111561258f57fe5b14156125f65761010081015160e08201516080830151918103916000918391816125b557fe5b0402905082604001516001600160a01b03166108fc829081150290604051600060405180830381858888f1935050505015801561165b573d6000803e3d6000fd5b5050565b6000838152600360209081526040808320858452600590925290912060028201546001600160a01b03163314612670576040805162461bcd60e51b815260206004820152601660248201527536bab9ba103132903837b9ba32b920b2323920b2323960511b604482015290519081900360640190fd5b6007810154156126bd576040805162461bcd60e51b8152602060048201526013602482015272686173206265656e206576616c75617465642160681b604482015290519081900360640190fd5b6007810183905560008054604051632444ea7160e21b815260206004820190815260038501805460026000196001831615610100020190911604602484018190529094936001600160a01b031692639113a9c4928692909182916044909101908490801561276c5780601f106127415761010080835404028352916020019161276c565b820191906000526020600020905b81548152906001019060200180831161274f57829003601f168201915b50509250505060206040518083038186803b15801561278a57600080fd5b505afa15801561279e573d6000803e3d6000fd5b505050506040513d60208110156127b457600080fd5b505160058501546007860154600487015492935090916000918391816127d657fe5b040190506005871015801561286357506000809054906101000a90046001600160a01b03166001600160a01b031663f282f1506040518163ffffffff1660e01b815260040160206040518083038186803b15801561283357600080fd5b505afa158015612847573d6000803e3d6000fd5b505050506040513d602081101561285d57600080fd5b50518310155b15612958576000546040805163e6f8f61b60e01b815260018681016024830181905260048301938452885460026000199382161561010002939093011691909104604483018190526001600160a01b039094169363e6f8f61b9389939091829160640190859080156129165780601f106128eb57610100808354040283529160200191612916565b820191906000526020600020905b8154815290600101906020018083116128f957829003601f168201915b50509350505050600060405180830381600087803b15801561293757600080fd5b505af115801561294b573d6000803e3d6000fd5b5050509181019150612d43565b6005871080156129e357506000809054906101000a90046001600160a01b03166001600160a01b031663f282f1506040518163ffffffff1660e01b815260040160206040518083038186803b1580156129b057600080fd5b505afa1580156129c4573d6000803e3d6000fd5b505050506040513d60208110156129da57600080fd5b50516001018310155b15612ad2576000546040805163e6f8f61b60e01b81526000198087016024830181905260048301938452885460026001821615610100029093011691909104604483018190526001600160a01b039094169363e6f8f61b938993909182916064019085908015612a945780601f10612a6957610100808354040283529160200191612a94565b820191906000526020600020905b815481529060010190602001808311612a7757829003601f168201915b50509350505050600060405180830381600087803b158015612ab557600080fd5b505af1158015612ac9573d6000803e3d6000fd5b50505050612d43565b600587108015612b5957506000809054906101000a90046001600160a01b03166001600160a01b031663f282f1506040518163ffffffff1660e01b815260040160206040518083038186803b158015612b2a57600080fd5b505afa158015612b3e573d6000803e3d6000fd5b505050506040513d6020811015612b5457600080fd5b505183145b15612bdb576000546040805163e6f8f61b60e01b8152603c6024820181905260048201928352875460026000196001831615610100020190911604604483018190526001600160a01b039094169363e6f8f61b938993909182916064019085908015612a945780601f10612a6957610100808354040283529160200191612a94565b6000809054906101000a90046001600160a01b03166001600160a01b031663f282f1506040518163ffffffff1660e01b815260040160206040518083038186803b158015612c2857600080fd5b505afa158015612c3c573d6000803e3d6000fd5b505050506040513d6020811015612c5257600080fd5b5051831015612d43576000546040805163e6f8f61b60e01b815260018681016024830181905260048301938452885460026000199382161561010002939093011691909104604483018190526001600160a01b039094169363e6f8f61b938993909182916064019085908015612d095780601f10612cde57610100808354040283529160200191612d09565b820191906000526020600020905b815481529060010190602001808311612cec57829003601f168201915b50509350505050600060405180830381600087803b158015612d2a57600080fd5b505af1158015612d3e573d6000803e3d6000fd5b505050505b60028501546040516001600160a01b039091169082156108fc029083906000818181858888f19350505050158015612d7f573d6000803e3d6000fd5b50600054604051630cafa83360e41b8152602060048201908152865460026000196001831615610100020190911604602483018190526001600160a01b039093169263cafa83309288929182916044019084908015612e1f5780601f10612df457610100808354040283529160200191612e1f565b820191906000526020600020905b815481529060010190602001808311612e0257829003601f168201915b505092505050600060405180830381600087803b158015612e3f57600080fd5b505af1158015612e53573d6000803e3d6000fd5b505050600e87018054600101905550612e6b896130d0565b50505050505050505050565b6060806060600080612e8761331d565b6000878152600560209081526040918290208251610100808201855282548252600180840154838601526002808501546001600160a01b0316848801526003850180548851938116159094026000190190931604601f810186900486028201860190965285815291949293606086019390830182828015612f495780601f10612f1e57610100808354040283529160200191612f49565b820191906000526020600020905b815481529060010190602001808311612f2c57829003601f168201915b505050918352505060048201805460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152938201939291830182828015612fdd5780601f10612fb257610100808354040283529160200191612fdd565b820191906000526020600020905b815481529060010190602001808311612fc057829003601f168201915b505050918352505060058201805460408051602060026001851615610100026000190190941693909304601f81018490048402820184019092528181529382019392918301828280156130715780601f1061304657610100808354040283529160200191613071565b820191906000526020600020905b81548152906001019060200180831161305457829003601f168201915b5050509183525050600682015460208201526007909101546040909101526060810151608082015160a083015160c084015160e090940151929b919a509850919650945092505050565b6000908152600360205260409020600d015490565b6000818152600360205260408120600b8101805460ff1916905560078101546008820154108015613105575080600601544211155b1561311a57600b8101805460ff191660011790555b80600701548160080154148015613135575080600601544211155b1561314a57600b8101805460ff191660021790555b80600e015481600d0154118015613165575080600601544210155b1561317a57600b8101805460ff191660031790555b80600e015481600d0154148015613195575080600601544210155b806131b9575080600e015481600d01541480156131b95750806007015481600e0154145b156131ce57600b8101805460ff191660041790555b50919050565b604051806102000160405280600081526020016060815260200160006001600160a01b0316815260200160608152602001600081526020016000815260200160008152602001600081526020016000815260200160008152602001600081526020016000600481111561324357fe5b8152602001606081526020016000815260200160008152602001606081525090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106132a657805160ff19168380011785556132d3565b828001600101855582156132d3579182015b828111156132d35782518255916020019190600101906132b8565b506132df92915061336b565b5090565b8280548282559060005260206000209081019282156132d357916020028201828111156132d35782518255916020019190600101906132b8565b604051806101000160405280600081526020016000815260200160006001600160a01b0316815260200160608152602001606081526020016060815260200160008152602001600081525090565b61338591905b808211156132df5760008155600101613371565b9056fe6d73672e76616c7565206d757374206c6172676572207468616e207461736b2e6465706f736974706f7374657241646472206d75737420657175616c207769746820706f737465724e616d6521a2646970667358221220a8eedb160c75a755fc72bfe3847795e90dd98cef5ac2b4d97e6e946c740ed72864736f6c63430006060033";

    public static final String FUNC_ACCEPTTASK = "acceptTask";

    public static final String FUNC_CHECKACCEPTCONDITION = "checkAcceptCondition";

    public static final String FUNC_CHECKSUBMITCONDITION = "checkSubmitCondition";

    public static final String FUNC_EVALUATESOLUTION = "evaluateSolution";

    public static final String FUNC_GETSOLUTIONINFO = "getSolutionInfo";

    public static final String FUNC_GETSOLUTIONLENGTH = "getSolutionLength";

    public static final String FUNC_GETTASKINFORMATION = "getTaskInformation";

    public static final String FUNC_POSTTASK = "postTask";

    public static final String FUNC_RETURNBALANCE = "returnBalance";

    public static final String FUNC_SUBMITSOLUTION = "submitSolution";

    @Deprecated
    protected TaskContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected TaskContract(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected TaskContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected TaskContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<TransactionReceipt> acceptTask(String workerName, BigInteger taskId) {
        final Function function = new Function(
                FUNC_ACCEPTTASK, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(workerName), 
                new org.web3j.abi.datatypes.generated.Uint256(taskId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> checkAcceptCondition(String workerName, BigInteger taskId) {
        final Function function = new Function(
                FUNC_CHECKACCEPTCONDITION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(workerName), 
                new org.web3j.abi.datatypes.generated.Uint256(taskId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> checkSubmitCondition(String workerName, BigInteger taskId) {
        final Function function = new Function(
                FUNC_CHECKSUBMITCONDITION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(workerName), 
                new org.web3j.abi.datatypes.generated.Uint256(taskId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> evaluateSolution(BigInteger taskId, BigInteger solutionId, BigInteger level) {
        final Function function = new Function(
                FUNC_EVALUATESOLUTION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(taskId), 
                new org.web3j.abi.datatypes.generated.Uint256(solutionId), 
                new org.web3j.abi.datatypes.generated.Uint256(level)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> getSolutionInfo(BigInteger solutionId) {
        final Function function = new Function(
                FUNC_GETSOLUTIONINFO, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(solutionId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> getSolutionLength(BigInteger taskId) {
        final Function function = new Function(
                FUNC_GETSOLUTIONLENGTH, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(taskId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> getTaskInformation(BigInteger taskId) {
        final Function function = new Function(
                FUNC_GETTASKINFORMATION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(taskId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> postTask(String posterName, String description, BigInteger deposit, BigInteger deadline, BigInteger maxWorkerNum, BigInteger minReputation, BigInteger taskType, String pointer) {
        final Function function = new Function(
                FUNC_POSTTASK, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(posterName), 
                new org.web3j.abi.datatypes.Utf8String(description), 
                new org.web3j.abi.datatypes.generated.Uint256(deposit), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline), 
                new org.web3j.abi.datatypes.generated.Uint256(maxWorkerNum), 
                new org.web3j.abi.datatypes.generated.Uint256(minReputation), 
                new org.web3j.abi.datatypes.generated.Uint256(taskType), 
                new org.web3j.abi.datatypes.Utf8String(pointer)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> returnBalance(BigInteger taskId) {
        final Function function = new Function(
                FUNC_RETURNBALANCE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(taskId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> submitSolution(String workerName, String solution, String pointer, BigInteger taskId) {
        final Function function = new Function(
                FUNC_SUBMITSOLUTION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(workerName), 
                new org.web3j.abi.datatypes.Utf8String(solution), 
                new org.web3j.abi.datatypes.Utf8String(pointer), 
                new org.web3j.abi.datatypes.generated.Uint256(taskId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static TaskContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new TaskContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static TaskContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new TaskContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static TaskContract load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new TaskContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static TaskContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new TaskContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<TaskContract> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String regAddr) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, regAddr)));
        return deployRemoteCall(TaskContract.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<TaskContract> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String regAddr) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, regAddr)));
        return deployRemoteCall(TaskContract.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<TaskContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String regAddr) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, regAddr)));
        return deployRemoteCall(TaskContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<TaskContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String regAddr) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, regAddr)));
        return deployRemoteCall(TaskContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }
}
